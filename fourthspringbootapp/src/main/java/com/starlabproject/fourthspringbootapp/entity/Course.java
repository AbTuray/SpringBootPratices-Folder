package com.starlabproject.fourthspringbootapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 100, unique = true)
    private String title;

    @Column(name = "instructor", nullable = false, length = 100, unique = false, updatable = true)
    private String instructor;

    // Constructors
    public Course() {
    }

    public Course(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
    }

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
