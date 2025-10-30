package com.starlabproject.thirdspringbootapp.repository;

import com.starlabproject.thirdspringbootapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


public interface StudentRepo extends JpaRepository <Student, Long> {

}


