package com.sample.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sample")
public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }

}