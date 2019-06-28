package com.ibm.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ibm.controller")
public class SpringBootJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcTemplateApplication.class, args);
	}

}
