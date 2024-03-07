package com.spring.api.spapi.rest;

import com.spring.api.spapi.common.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    //define student
    private Student student;

    //define constructor for dependency injection
    @Autowired
    public StudentController(Student st){
        student = st;
    }

    @GetMapping("/study")
    public String getStudentStudy(){
        return student.getStudy();
    }

}
