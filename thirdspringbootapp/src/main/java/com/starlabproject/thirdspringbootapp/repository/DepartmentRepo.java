package com.starlabproject.thirdspringbootapp.repository;

import com.starlabproject.thirdspringbootapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
