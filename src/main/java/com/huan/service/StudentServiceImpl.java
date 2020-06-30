package com.huan.service;

import com.huan.model.Student;
import com.huan.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findOne(id);
    }

    @Override
    public void save(Student model) {
        studentRepository.save(model);
    }

    @Override
    public void remove(Long id) {
        studentRepository.delete(id);
    }
}
