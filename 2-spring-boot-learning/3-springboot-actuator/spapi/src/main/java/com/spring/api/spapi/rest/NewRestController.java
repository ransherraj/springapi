package com.spring.api.spapi.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {
    // hellow world
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
    @Value("${father.name}")
    public String fatherName;

    @Value("${mother.name}")
    public String motherName;

    @GetMapping("/father-name")
    public String getFatherName(){
        return fatherName;
    }

    @GetMapping("/mother-name")
    public String getMotherName(){
        return motherName;
    }
}
