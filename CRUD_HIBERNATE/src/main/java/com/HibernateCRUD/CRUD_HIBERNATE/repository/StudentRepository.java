package com.HibernateCRUD.CRUD_HIBERNATE.repository;

import com.HibernateCRUD.CRUD_HIBERNATE.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
