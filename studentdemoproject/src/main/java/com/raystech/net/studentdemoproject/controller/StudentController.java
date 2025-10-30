package com.raystech.net.studentdemoproject.controller;


import com.raystech.net.studentdemoproject.model.StudentModel;
import com.raystech.net.studentdemoproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/allStudent")
    public List<StudentModel> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentModel getStudentById(Long id){
        return studentService.findById(id);
    }

    @PostMapping("/addStudent")
    public StudentModel addStudent(@RequestBody StudentModel student){
        return studentService.saveStudent(student);
    }

    @PutMapping("/updateStudent/{id}")
    public StudentModel updateStudent(@PathVariable Long id, @RequestBody StudentModel studentDetails){
        return studentService.updateStudent(id, studentDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }


}
