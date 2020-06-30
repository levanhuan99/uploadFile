package com.huan.controller;


import com.huan.model.Student;
import com.huan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class StudentController {

    @Autowired
    Environment env;

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public ModelAndView showList(){
        ModelAndView modelAndView =new ModelAndView("/list");
        Iterable<Student> students = studentService.findAll();
        modelAndView.addObject("student",students);
        return modelAndView;
    }

}
