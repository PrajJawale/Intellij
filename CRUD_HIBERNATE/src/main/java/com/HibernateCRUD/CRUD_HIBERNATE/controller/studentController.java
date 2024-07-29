package com.HibernateCRUD.CRUD_HIBERNATE.controller;
import com.HibernateCRUD.CRUD_HIBERNATE.DTO.StudentResponseDTO;
import com.HibernateCRUD.CRUD_HIBERNATE.model.Student;
import com.HibernateCRUD.CRUD_HIBERNATE.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class studentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/add")
    public Student add( @RequestBody Student  student){
        return studentService.add(student);

    }

    @PutMapping("/{studentId}")
    public String update(@PathVariable int studentId , @RequestBody Student updateStudent) {
       return studentService.updateStudent(studentId ,updateStudent);

    }

    @DeleteMapping ("/delete/{id}")
    public String deleteStudent(@PathVariable int id ) throws Exception {
          return studentService.deleteStudent(id);
    }

    @GetMapping("/{id}")
    public StudentResponseDTO getStudent(@PathVariable int id) throws Exception {
        return studentService.getStudent(id);
    }
}
