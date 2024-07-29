package com.HibernateCRUD.CRUD_HIBERNATE.service.serviceImpl;

import com.HibernateCRUD.CRUD_HIBERNATE.DTO.StudentResponseDTO;
import com.HibernateCRUD.CRUD_HIBERNATE.model.Student;
import com.HibernateCRUD.CRUD_HIBERNATE.repository.StudentRepository;
import com.HibernateCRUD.CRUD_HIBERNATE.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student add(Student student) {
        student.setRolNo(student.getRolNo());
        student.setName(student.getName());
        student.setCollegeName(student.getCollegeName());

        studentRepository.save(student);

        return student;
    }



    @Override
    public String  updateStudent(int id , Student updateStudent) {
      Student student = studentRepository.findById(id).get();
      student.setName(updateStudent.getName());
      student.setRolNo(updateStudent.getRolNo());
      studentRepository.save(student);
      return "Name Updates as "+ student.getName();
    }

    @Override
    public String deleteStudent(int id) throws Exception {
      try{
         Student student = studentRepository.findById(id).get();
         if(student!=null){
             studentRepository.deleteById(id);
             return "Deleted SuccessFully";
         }
      }
       catch (Exception e){
          throw  new Exception("Student not Exist ");
       }

      return null;
    }

    @Override
    public StudentResponseDTO getStudent(int id) throws Exception {
        try{
           Student student = studentRepository.findById(id).get();
           if(student!=null){
                return StudentResponseDTO.builder()
                       .rolNo(student.getRolNo())
                       .name(student.getName())
                       .collegeName(student.getCollegeName())
                       .id(student.getId()).build();

           }

        } catch (Exception e){
            throw  new Exception("Student not found");

        }
        return null;
    }


}
