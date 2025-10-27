package com.start.lab.firstspringapp.controller;

import com.start.lab.firstspringapp.model.StudentModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentPostController {


    @RequestMapping("/addStudent")
    public String addStudent(@RequestBody StudentModel student){
        return "Receive Student " + student.getName() + " From " + student.getUniversity() +
                " In Department " + student.getDepartment();
    }

    @GetMapping("/api/student/{name}")
    public String getStudentByName(@PathVariable String name){
        return "Student Name: " + name;

    }

    @GetMapping("/api/student")
    public String getStudentByQuery(
            @RequestParam String name,
            @RequestParam String university
    ){
        return "Student Name: " + name + ", University: " + university;

    }

    @GetMapping("/api/studentDetail")
    public StudentModel getDetails(){
        StudentModel s = new StudentModel();
        s.setName("Abdulai");
        s.setUniversity("Central University");
        s.setDepartment("Computer Science");
        return s;
    }


}
