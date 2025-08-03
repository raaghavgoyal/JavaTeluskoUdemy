package com.example.spring_boot_rest;

import com.example.spring_boot_rest.model.JobPost;
import com.example.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")//to remove CORS error
// because of different port number of react and java (treats it as different origin )
public class JobRestController {

    @Autowired
    private JobService service;


    @GetMapping("jobPosts")
    //@ResponseBody   //tells the compiler, we are sending body(data),
                    // don't try to search for view name
                    // or we can directly use @RestController for the same
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
}
