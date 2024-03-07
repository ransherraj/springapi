package com.spring.api.spapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//to run different packages
/*@SpringBootApplication(
		scanBasePackages = {"com.spring.api.spapi",
				"com.spring.api.util"}
)*/

@SpringBootApplication
public class SpapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpapiApplication.class, args);
	}
}
