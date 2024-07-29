package com.StudentDemo.demo.Controller;

import com.StudentDemo.demo.Entity.Student;
import com.StudentDemo.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Student1")
@RestController
public class StudentController {


    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        return studentService.add(student);
    }
}
