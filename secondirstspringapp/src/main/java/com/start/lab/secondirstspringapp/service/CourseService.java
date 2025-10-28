package com.start.lab.secondirstspringapp.service;

import com.start.lab.secondirstspringapp.model.CourseModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private List<CourseModel> courseList = new ArrayList<>();

    public CourseService(){
        courseList.add(new CourseModel(1, "Introduction to Programming", "Dr. Ray"));
        courseList.add(new CourseModel(2, "Data Structures", "Prof. Olive"));
        courseList.add(new CourseModel(3, "Database Systems", "Dr. Max"));
    }

    // Get all courses
    public List<CourseModel> getAllCourses(){
        return courseList;
    }

    // Get course by id
    public CourseModel getCourseById (int id){
        for(CourseModel course: courseList){
            if(course.getId() == id){
                return course;
            }
        }
        return null; // or throw an exception if preferred
    }

    // Adding new course
    public void addNewCourse(CourseModel course){
        courseList.add(course);
    }

    // Update a course by id
    public void updateCourse(int id, CourseModel updatedCourse){
        for(int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getId() == id){
                courseList.set(i, updatedCourse);
                return;
            }
        }
    }

    // Delete a course
    public void deleteCourse(int id){
        courseList.removeIf(courseModel -> courseModel.getId() == id);
    }
}
