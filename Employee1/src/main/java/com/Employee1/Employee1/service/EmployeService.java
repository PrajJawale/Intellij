package com.Employee1.Employee1.service;

import com.Employee1.Employee1.dtos.EmployeeResponseDto;
import com.Employee1.Employee1.dtos.EmployeeReuestDto;
import com.Employee1.Employee1.entity.Employee1;
import com.Employee1.Employee1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeResponseDto update(int id , EmployeeReuestDto employeeReuestDto){
        Employee1 emp =employeeRepository.findById(id).get();
        if(emp!=null){
            emp.setEmpName(employeeReuestDto.getEmpName());
            emp.setCompany(employeeReuestDto.getCompany());
        }

        employeeRepository.save(emp);
        return EmployeeResponseDto.builder()
                .empId(id)
                .empName(employeeReuestDto.getEmpName())
                .company(employeeReuestDto.getCompany())
                .build();
      }

      public String add(EmployeeReuestDto employeeReuestDto){
          Employee1 emp = new Employee1();

          emp.setEmpName(employeeReuestDto.getEmpName());
          emp.setCompany(employeeReuestDto.getCompany());
          emp.setAddress(employeeReuestDto.getAddress());

          employeeRepository.save(emp);

          return "Student Added SuccessFully" + emp.getEmpName();

      }
}
