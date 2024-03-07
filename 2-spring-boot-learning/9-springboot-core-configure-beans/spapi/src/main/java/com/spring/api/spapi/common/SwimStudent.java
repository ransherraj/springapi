package com.spring.api.spapi.common;

import java.util.List;


//SwimStudent does not have @Component annotation, so there is need of config class
// Therefore we configured as a spring bean using @Bean
public class SwimStudent implements Student{

    public SwimStudent(){
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getStudy() {
        return "Swim 1 hour daily";
    }

    @Override
    public List<Integer> getList() {
        return null;
    }
}
