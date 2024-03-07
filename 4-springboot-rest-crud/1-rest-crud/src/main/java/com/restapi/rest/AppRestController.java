package com.restapi.rest;

import com.restapi.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class AppRestController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello";
    }

}
