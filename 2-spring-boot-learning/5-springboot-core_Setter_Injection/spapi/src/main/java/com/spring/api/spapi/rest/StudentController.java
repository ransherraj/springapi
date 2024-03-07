package com.spring.api.spapi.rest;

import com.spring.api.spapi.common.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    //define student
    private Student student;

    // no need for constructor or setter // not recommended as it can also useful

    //define constructor for dependency injection
    @Autowired
    public StudentController(Student st){
        student = st;
    }

    @Autowired
    public void setStudent(Student stu){
        student = stu;
    }

    @GetMapping("/study")
    public String getStudentStudy(){
        return student.getStudy();
    }

    @GetMapping("/studyList")
    public List<Integer> getStudentStudyList(){
        return student.getList();
    }

}
