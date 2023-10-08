package com.monishwar.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monishwar.student.model.student;
import com.monishwar.student.service.studentService;

@RestController
@RequestMapping("student")
@CrossOrigin
public class studentController {
    
    @Autowired
    private studentService studentService;

    @PostMapping("add")
    public String add(@RequestBody student student){
        studentService.saveStudent(student);
        return "Added student "+student.getFirstName();
    }

    @GetMapping
    public List<student> get(){
        return studentService.getStudents();
    }

}