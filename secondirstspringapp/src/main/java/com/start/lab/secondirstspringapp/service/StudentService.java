package com.start.lab.secondirstspringapp.service;

import com.start.lab.secondirstspringapp.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<StudentModel> students = new ArrayList<>();

    // Constructor to initialize some sample data
    public StudentService(){
        students.add(new StudentModel("AbRay", "Computer Science", "MIT"));
        students.add(new StudentModel("Olive", "Mechanical Engineering", "Stanford"));
        students.add(new StudentModel("Max", "Electrical Engineering", "Caltech"));
    }

    // Get all students
    public List<StudentModel> getAllStudents(){
        return students;
    }

    // Get student by name
    public StudentModel getStudentByName(String name){
        for(StudentModel student : students){
            if(student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null; // or throw an exception if preferred
    }

    // Add new student
    public void addStudent(StudentModel student){
        students.add(student);
    }

    // Update existing student
    public void updateStudent(String name, StudentModel updatedStudent){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equalsIgnoreCase(name)){
                students.set(i, updatedStudent);
                return;
            }
        }

    }

    // delete student
    public void deleteStudent(String name){
        students.removeIf(student -> student.getName().equalsIgnoreCase(name));
    }


}
