package com.monishwar.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monishwar.student.model.student;
import com.monishwar.student.repository.studentRepository;

@Service
public class studentServiceImpl implements studentService{
    
    @Autowired
    private studentRepository studentRepository;

    @Override
    public student saveStudent(student student){
        return studentRepository.save(student);
    }

    @Override
    public List<student> getStudents() {
        return studentRepository.findAll();
    }

    

}