package com.start.lab.secondirstspringapp.model;


import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;



public class StudentModel {
    private String name;
    private String department;
    private String university;


    public StudentModel(){
    }

    public StudentModel(String name, String department, String university) {
        this.name = name;
        this.department = department;
        this.university = university;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getUniversity(){
        return university;
    }
    public void setUniversity(String university){
        this.university = university;
    }
}
