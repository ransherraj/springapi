package com.javaapi.api.Controller;

import com.javaapi.api.model.SqlBook;
import com.javaapi.api.repository.SqlBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;

    @Autowired
    private SqlBookRepository sqlBookRepository;

    @GetMapping("/books")
    public List<SqlBook> getBookList(){
        return sqlBookRepository.findAllData();
    }

    @GetMapping("/user")
    public String getUser(){
        return username + ' ' + password;
    }

}
