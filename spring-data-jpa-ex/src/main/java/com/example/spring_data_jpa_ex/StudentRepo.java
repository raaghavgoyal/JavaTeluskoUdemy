package com.example.spring_data_jpa_ex;

import com.example.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository <Student, Integer>{

    //JPQL JPA query language: similar to sql just name of table and columns exchanged with class and attributes
    //@Query("select s from Student s where s.name = ?1")   //?1 will be replaced by first param
    //works without query above mostly, since JPA tries to create methods for us
    List<Student> findByName(String name);
    List<Student> findByMarksGreaterThan(int marks);

}
