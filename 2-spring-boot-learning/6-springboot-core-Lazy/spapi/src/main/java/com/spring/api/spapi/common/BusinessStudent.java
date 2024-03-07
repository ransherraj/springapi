package com.spring.api.spapi.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Primary  // Used to make it default implement in Controller
// @Lazy  //This BusinessStudent only created if it is needed else not
public class BusinessStudent implements Student {

    @Override
    public String getStudy() {
        return "Study Business Activities";
    }

    public BusinessStudent(){
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }

    @Override
    public List<Integer> getList() {
        return null;
    }
}
