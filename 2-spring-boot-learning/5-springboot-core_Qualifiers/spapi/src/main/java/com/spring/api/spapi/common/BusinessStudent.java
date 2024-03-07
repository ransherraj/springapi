package com.spring.api.spapi.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary  // Used to make it default implement in Controller
public class BusinessStudent implements Student {

    @Override
    public String getStudy() {
        return "Study Business Activities";
    }

    @Override
    public List<Integer> getList() {
        return null;
    }
}
