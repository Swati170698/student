package com.calculator.controller;

import com.calculator.Entity.Student;
import com.calculator.dto.StudentDto;
import com.calculator.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    studentService service;

    @PostMapping("/save")
    public String saveStudent(@RequestBody StudentDto details){
        return service.saveDetails(details);
    }

    @GetMapping("/get/details")
    public List<Student> getDetails(){
        return service.studentList();
    }

}
