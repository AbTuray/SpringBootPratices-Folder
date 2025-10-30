package com.raystech.net.studentdemoproject.repository;

import com.raystech.net.studentdemoproject.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Long> {

}
