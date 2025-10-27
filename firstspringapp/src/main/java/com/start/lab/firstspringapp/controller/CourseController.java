package com.start.lab.firstspringapp.controller;

import com.start.lab.firstspringapp.model.CourseModel;
import com.start.lab.firstspringapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/course")
    public String courseInfo(){
        return courseService.getCourseInfo();
    }

    @Autowired
    private CourseService2 service;

    @RequestMapping("/info")
    public String getCourseInfo() {
        return service.getCourse();
    }

    @GetMapping("api/course")
    public CourseModel getCourses(){
        CourseModel course = new CourseModel();
        course.setId("101");
        course.setTitle("Introduction to Spring Boot");
        course.setInstructor("Dr. Ray");
        course.setDuration("8 weeks");
        return course;
    }

    @PostMapping("api/course/create")
    public CourseModel createCourse(@RequestBody CourseModel course){
        // In a real application, you would save the course to a database here
        course.getTitle();
        course.getInstructor();
        course.getDuration();
        return course;
    }

    @PutMapping("api/course/{id}")
    public CourseModel updateCourse(@PathVariable String id, @RequestBody CourseModel course){
        course.setId(id);
        return course;
    }

    @DeleteMapping("api/course/{id}")
    public CourseModel deleteCourse(@PathVariable String id){
        CourseModel course = new CourseModel();
        course.setId(id);
        course.setTitle("Deleted Course");
        course.setInstructor("N/A");
        course.setDuration("N/A");
        return course;
    }
}
