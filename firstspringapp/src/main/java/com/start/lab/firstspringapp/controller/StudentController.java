package com.start.lab.firstspringapp.controller;

import com.start.lab.firstspringapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

   @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public String sayHello(){
        return studentService.getStudentInfo();
    }
}
