package com.start.lab.firstspringapp.service;

import org.springframework.stereotype.Service;

@Service
public class CourseService2 {

    public String getCourse(){
        return "Course Name: Java, Duration: 10 weeks, Instructor: Dr. Turay";
    }
}
