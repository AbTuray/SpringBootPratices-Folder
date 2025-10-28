package com.starlabproject.thirdspringbootapp.controller;

import com.starlabproject.thirdspringbootapp.model.Student;
import com.starlabproject.thirdspringbootapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        student.setId(id);
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
