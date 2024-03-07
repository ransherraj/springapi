package com.spring.api.spapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;
    @Autowired
    SqlBookRepository sqlBookRepository;

    @GetMapping("/books")
    public List<SqlBook> getBookList(){
        return sqlBookRepository.findAlls();
    }

    @GetMapping("/user")
    public String getUser(){
        return username + ' ' + password;
    }

}
