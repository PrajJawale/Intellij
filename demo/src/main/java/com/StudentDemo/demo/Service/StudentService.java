package com.StudentDemo.demo.Service;

import com.StudentDemo.demo.Entity.Student;
import com.StudentDemo.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public  String add(Student student){
        student.setName(student.getName());
        student.setRollNo(student.getRollNo());
        studentRepository.save(student);
        return "Student Added Successfully";
    }
}
