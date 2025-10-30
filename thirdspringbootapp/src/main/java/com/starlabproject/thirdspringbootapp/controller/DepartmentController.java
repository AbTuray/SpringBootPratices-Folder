package com.starlabproject.thirdspringbootapp.controller;


import com.starlabproject.thirdspringbootapp.model.Department;
import com.starlabproject.thirdspringbootapp.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping("/add")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department){
        return ResponseEntity.ok(departmentRepo.save(department));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDepartments() {
        return ResponseEntity.ok(departmentRepo.findAll());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id){
//        Department department = departmentRepo.findById(id).orElse(null);
//        if (department == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(department);
//    }

}
