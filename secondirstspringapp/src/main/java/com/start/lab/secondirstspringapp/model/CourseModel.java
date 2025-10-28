package com.start.lab.secondirstspringapp.model;

public class CourseModel {

    private int id;
    private String title;
    private String instructor;

    public CourseModel() {
    }

    public CourseModel(int id, String title, String instructor) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
