package com.start.lab.firstspringapp.service;

import org.springframework.stereotype.Component;


@Component
public class CourseService {

    public String getCourseInfo(){
        return "Course Name: Introduction to Spring Boot, Duration: 8 weeks, Instructor: Dr. Smith";
    }
}
