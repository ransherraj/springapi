package com.restapi.rest;

import com.restapi.entity.Student;
import com.restapi.exceptions.StudentErrorResponse;
import com.restapi.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping
public class StudentRestController {

    // Only Once load Data

    List<Student> studentList;
    @PostConstruct
    public void loadStudentData(){
        studentList =  new ArrayList<>();

        studentList.add(new Student("Ransher", "Raj"));
        studentList.add(new Student("Raj", "Verma"));
        studentList.add(new Student("Java", "Basic"));

    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        return studentList;
    }

    @GetMapping("/students/{studentId}")
    public Student studentById(@PathVariable int studentId){

        /*try{
            return studentList.get(studentId);
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new
        }*/

        if(studentId >= studentList.size() || studentId < 0){
            throw new StudentNotFoundException("Student id Not Found - " + studentId);
        }
        // Add Index to the student list
        return studentList.get(studentId);
    }


}
