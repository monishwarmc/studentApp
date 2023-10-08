package com.monishwar.student.service;

import java.util.List;

import com.monishwar.student.model.student;

public interface studentService {
    public student saveStudent(student student);
    public List<student> getStudents();
}