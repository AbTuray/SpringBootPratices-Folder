package com.starlabproject.thirdspringbootapp.exceptions;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id) {
        super("Student Not Found: " + id);
    }
}
