package com.start.lab.secondirstspringapp.controller;


import com.start.lab.secondirstspringapp.model.CourseModel;
import com.start.lab.secondirstspringapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<CourseModel> getCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public CourseModel getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    }

    @PostMapping
    public String addCourse(@RequestBody CourseModel course){
        courseService.addNewCourse(course);
        return "Course added successfully";
    }

    @GetMapping("/update/{id}")
    public String updateCourse(@PathVariable int id, @RequestBody CourseModel updatedCourse){
        courseService.updateCourse(id, updatedCourse);
        return "Updated course successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable int id){
        courseService.deleteCourse(id);
        return "Deleted course successfully";
    }
}
