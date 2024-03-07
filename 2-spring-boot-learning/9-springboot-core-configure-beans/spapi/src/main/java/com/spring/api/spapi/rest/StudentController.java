package com.spring.api.spapi.rest;

import com.spring.api.spapi.common.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    public StudentController(@Qualifier("swim") Student st){
        System.out.println("In Constructor : " + getClass().getSimpleName());
        student = st;
    }
    /*public StudentController(Student st){
        student = st;
    }*/

    //For qualifier use the class name but first letter with lowerCase.
    // Qualifiers have higher priority than primary
    // @Primary can only be used in one class
    /*@Autowired
    public void setStudent(@Qualifier("swimStudent") Student stu){

        student = stu;
    }*/

    /*
    public void setStudent( Student stu){
        student = stu;
    }*/

    @GetMapping("/study")
    public String getStudentStudy(){
        return student.getStudy();
    }

    /*@GetMapping("/check")
    public String check(){
        return "Comparing beans : student == newStudent : " + (student == newStudent);
    }*/

    @GetMapping("/studyList")
    public List<Integer> getStudentStudyList(){
        return student.getList();
    }

}
