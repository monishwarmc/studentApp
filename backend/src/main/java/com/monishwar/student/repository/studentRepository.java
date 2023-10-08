package com.monishwar.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monishwar.student.model.student;

@Repository
public interface studentRepository extends JpaRepository<student, Integer>{
    
}