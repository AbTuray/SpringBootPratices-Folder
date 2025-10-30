package com.raystech.net.studentdemoproject.service;


import com.raystech.net.studentdemoproject.model.StudentModel;
import com.raystech.net.studentdemoproject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

   public List<StudentModel> getAllStudents() {
       return studentRepo.findAll();
   }

   public StudentModel findById(Long id){
       return studentRepo.findById(id).orElse(null);
   }

   public StudentModel saveStudent(StudentModel student){
       return studentRepo.save(student);
   }

   public StudentModel updateStudent(Long id, StudentModel studentDetails) {
       StudentModel student = studentRepo.findById(id).orElse(null);
       if (student != null) {
           student.setFirstName(studentDetails.getFirstName());
           student.setLastName(studentDetails.getLastName());
           student.setEmail(studentDetails.getEmail());
           student.setAge(studentDetails.getAge());
           return studentRepo.save(student);
       }
       return null;

   }

    public void deleteStudent(Long id){
         studentRepo.deleteById(id);
    }


}
