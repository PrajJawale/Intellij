package com.HibernateCRUD.CRUD_HIBERNATE.service;

import com.HibernateCRUD.CRUD_HIBERNATE.DTO.StudentResponseDTO;
import com.HibernateCRUD.CRUD_HIBERNATE.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;


public interface StudentService {
    public Student add(Student student);
    public String updateStudent(int id , Student updateStudent);
    String deleteStudent(int id) throws Exception;
    StudentResponseDTO getStudent(int id) throws Exception;


}
