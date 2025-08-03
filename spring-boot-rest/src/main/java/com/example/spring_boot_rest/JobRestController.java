package com.example.spring_boot_rest;

import com.example.spring_boot_rest.model.JobPost;
import com.example.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")//to remove CORS error
// because of different port number of react and java (treats it as different origin )
public class JobRestController {

    @Autowired
    private JobService service;


    @GetMapping(path="jobPosts",produces = {"application/json"})
    //this produces field , ensures data is sent in the specified format only
    //@ResponseBody   //tells the compiler, we are sending body(data),
                    // don't try to search for view name
                    // or we can directly use @RestController for the same
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }

    @PostMapping(path = "jobPost", consumes = {"application/xml"})
    public JobPost addJob(@RequestBody JobPost jobPost){//@RequestBody to send the data
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "Deleted";
    }
}
