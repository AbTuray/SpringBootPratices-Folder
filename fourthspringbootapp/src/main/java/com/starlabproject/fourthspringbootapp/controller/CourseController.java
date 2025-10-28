package com.starlabproject.fourthspringbootapp.controller;

import com.starlabproject.fourthspringbootapp.entity.Course;
import com.starlabproject.fourthspringbootapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/allCourses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(Long id){
        return courseService.getCourseById(id);
    }

    @PostMapping("addCourse")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course courseDetails){
        return courseService.updateCourse(id, courseDetails);
    }
}
