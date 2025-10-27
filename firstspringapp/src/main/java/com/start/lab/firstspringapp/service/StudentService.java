package com.start.lab.firstspringapp.service;

import org.springframework.stereotype.Component;

@Component
public class StudentService {

    public String getStudentInfo(){
        return "Student Name: Abdulai, Age: 25, Major: Computer Science";
    }
}
