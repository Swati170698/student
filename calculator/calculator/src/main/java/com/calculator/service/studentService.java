package com.calculator.service;

import com.calculator.Entity.Student;
import com.calculator.Repo.StudentRepo;
import com.calculator.dto.StudentDto;
import org.hibernate.tool.schema.internal.StandardUserDefinedTypeExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class studentService {

    @Autowired
    StudentRepo repo;

    public String saveDetails(StudentDto dto){
        Student s1 = new Student();
        s1.setAge(dto.getAge());
        s1.setName(dto.getName());
        s1.setPhoneNo(dto.getPhoneNo());
        s1.setId(UUID.randomUUID());
        repo.save(s1);
        return "Student save successfully";
    }

    public List<Student> studentList(){
       List<Student> allData =  repo.findAll();
       return allData;
    }

}
