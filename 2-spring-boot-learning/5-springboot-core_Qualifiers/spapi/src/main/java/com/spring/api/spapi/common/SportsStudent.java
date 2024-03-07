package com.spring.api.spapi.common;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SportsStudent implements Student {

    @Override
    public String getStudy() {
        return "Loves To Play all outdoor sports.";
    }

    @Override
    public List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<5; i++){
            list.add(i+1);
        }
        return list;
    }
}
