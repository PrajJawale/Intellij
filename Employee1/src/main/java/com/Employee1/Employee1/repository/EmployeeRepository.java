package com.Employee1.Employee1.repository;

import com.Employee1.Employee1.entity.Employee1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee1,Integer> {
}
