package com.mystudent.courses;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mystudent.courses")
public class CourseServiceApplication 
{
    public static void main(String[] args) 
    {
        SpringApplication.run(CourseServiceApplication.class, args);
    }
}