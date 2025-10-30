package com.starlabproject.thirdspringbootapp.service;

import com.starlabproject.thirdspringbootapp.dto.StudentDTO;
import com.starlabproject.thirdspringbootapp.model.Student;
import com.starlabproject.thirdspringbootapp.repository.DepartmentRepo;
import com.starlabproject.thirdspringbootapp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private DepartmentRepo departmentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Student addStudent(StudentDTO dto){
        // Convert DTO → Entity
        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setEmail(dto.getEmail());
        student.setAge(dto.getAge());

        return studentRepo.save(student);
    }

    public Student updateStudent(Long id, StudentDTO dto){
        Student existing = studentRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        existing.setFirstName(dto.getFirstName());
        existing.setLastName(dto.getLastName());
        existing.setEmail(dto.getEmail());
        existing.setAge(dto.getAge());
        return studentRepo.save(existing);
    }

    public void deleteStudent(Long id){
        studentRepo.deleteById(id);
    }

    public Student getStudentById(Long id){
        return studentRepo.findById(id).orElse(null);
    }
}
