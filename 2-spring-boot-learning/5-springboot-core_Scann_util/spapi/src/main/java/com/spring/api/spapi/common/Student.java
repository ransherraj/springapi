package com.spring.api.spapi.common;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Student implements StudentInterface {

    @Override
    public String getStudy(){
        return "5 hours Daily";
    }
    @Override
    public List<Integer> getList(){
       List<Integer> li=new ArrayList<>(3);
       li.add(1);
       li.add(2);
       li.add(3);
        return li;
    };
}
