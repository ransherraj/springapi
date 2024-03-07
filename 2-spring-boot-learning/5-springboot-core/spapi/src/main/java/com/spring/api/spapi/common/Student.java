package com.spring.api.spapi.common;

import org.springframework.stereotype.Component;

@Component
public class Student implements StudentInterface {

    @Override
    public String getStudy(){
        return "5 hours Daily!!!!!";
    }
}
