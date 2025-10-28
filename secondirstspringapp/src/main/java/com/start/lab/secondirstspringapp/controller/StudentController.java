package com.start.lab.secondirstspringapp.controller;


import com.start.lab.secondirstspringapp.model.StudentModel;
import com.start.lab.secondirstspringapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Get all students
    @GetMapping
    public List<StudentModel> getAllStudent(){
        return studentService.getAllStudents();
    }

    // Get student by name
    @GetMapping("/{name}")
    public StudentModel getStudentByName(@PathVariable String name){
        return studentService.getStudentByName(name);
    }

    // Post new student
    @PostMapping
    public String addStudent (@RequestBody StudentModel student){
        studentService.addStudent(student);
        return "Student added successfully";
    }

    // Update existing student
    @PutMapping("/{name}")
    public String updateStudent(@PathVariable String name, @RequestBody StudentModel updatedStudent){
        studentService.updateStudent(name, updatedStudent);
        return "Student updated successfully";
    }

    // Delete student
    @DeleteMapping("/{name}")
    public String deleteStudent(@PathVariable String name){
        studentService.deleteStudent(name);
        return "Student deleted successfully";
    }


}
