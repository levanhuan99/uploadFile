package com.huan.service;

import com.huan.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Student findById(Long id);

    void save(Student model);

    void remove(Long id);
}
