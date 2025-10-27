package com.start.lab.firstspringapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentApiController {

    @RequestMapping("/api/student")
    public Map<String , String> studentInfo(){
        Map<String, String> newStudent = new HashMap<>();
        newStudent.put("id", "1");
        newStudent.put("department", "Computer Science");
        newStudent.put("university", "Central University");
        return newStudent;

    }
}
