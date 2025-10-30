package com.starlabproject.thirdspringbootapp.controller;

import com.starlabproject.thirdspringbootapp.dto.StudentDTO;
import com.starlabproject.thirdspringbootapp.exceptions.StudentNotFoundException;
import com.starlabproject.thirdspringbootapp.model.Student;
import com.starlabproject.thirdspringbootapp.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Student>  addStudent(@Valid @RequestBody StudentDTO studentdto){
        Student saveStudent = studentService.addStudent(studentdto);
        return ResponseEntity.ok(saveStudent);
    }

    @GetMapping("/{id}")
    public  Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<List<Student>>  updateStudent(@Valid @PathVariable Long id, @RequestBody StudentDTO student){
        Student updatedStudent = studentService.updateStudent(id, student);
        List<Student> allStudents = studentService.getAllStudents();
        return ResponseEntity.ok(allStudents);



    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
