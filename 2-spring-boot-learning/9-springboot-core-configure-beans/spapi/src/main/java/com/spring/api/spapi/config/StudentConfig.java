package com.spring.api.spapi.config;

import com.spring.api.spapi.common.Student;
import com.spring.api.spapi.common.SwimStudent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    //@Bean
    @Bean("swim")   // with or without bean id
    public Student swimStudent(){
        return new SwimStudent();
    }
}
