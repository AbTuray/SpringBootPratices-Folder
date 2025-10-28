package com.starlabproject.fourthspringbootapp.repository;

import com.starlabproject.fourthspringbootapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
