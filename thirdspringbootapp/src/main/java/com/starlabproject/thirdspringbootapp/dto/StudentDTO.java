package com.starlabproject.thirdspringbootapp.dto;


import jakarta.validation.constraints.*;

public class StudentDTO {

    @NotBlank(message = "First name is mandatory")
    private String firstName;
    @NotBlank(message = "First name is mandatory")
    private String lastName;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Age is mandatory")
    @Min(value = 0, message = "Age should not be less than 0")
    @Max(value = 30, message = "Age should not be greater than 30")
    private int age;

    private String studentId;
    private Long departmentId;

    // Default constructor
    public StudentDTO() {
    }

    // Constructor with parameters
    public StudentDTO(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public Long getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }


}
