package com.spring.api.spapi.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
//@Lazy
public class BoardStudent implements Student {

    @Override
    public String getStudy(){
        return "5 hours Daily";
    }

    public BoardStudent(){
        System.out.println("In Constructor : " + getClass().getSimpleName());
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
