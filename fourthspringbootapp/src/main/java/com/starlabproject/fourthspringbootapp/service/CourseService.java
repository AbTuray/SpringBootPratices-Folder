package com.starlabproject.fourthspringbootapp.service;

import com.starlabproject.fourthspringbootapp.entity.Course;
import com.starlabproject.fourthspringbootapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id){
        return courseRepository.findById(id).orElse(null);
    }

    public Course createCourse(Course course){
        return courseRepository.save(course);
    }

    public Course updateCourse(Long id, Course courseDetails){
        Course course = courseRepository.findById(id).orElse(null);
        if(course != null){
            course.setTitle(courseDetails.getTitle());
            course.setInstructor(courseDetails.getInstructor());
            return courseRepository.save(course);
        }
        return null;
    }

    public void deleteCourse(Long id){
        courseRepository.deleteById(id);
    }
}
