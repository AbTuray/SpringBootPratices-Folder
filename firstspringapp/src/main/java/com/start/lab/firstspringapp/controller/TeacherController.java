package com.start.lab.firstspringapp.controller;

import com.start.lab.firstspringapp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacher;

    @RequestMapping("/teacher")
    public String teachInfo(){
        return teacher.teach();
    }

}
