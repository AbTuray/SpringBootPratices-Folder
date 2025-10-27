package com.start.lab.secondirstspringapp.service;

import com.start.lab.secondirstspringapp.model.StudentModel;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentModel createStudent(){
        StudentModel student = new StudentModel();
        student.setName("Abdulai");
        student.setUniversity("MIT");
        student.setDepartment("Computer Science");
        return student;
    }
}
