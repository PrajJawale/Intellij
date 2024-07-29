package com.Employee1.Employee1.controller;

import com.Employee1.Employee1.dtos.EmployeeResponseDto;
import com.Employee1.Employee1.dtos.EmployeeReuestDto;
import com.Employee1.Employee1.entity.Employee1;
import com.Employee1.Employee1.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeService employeService;
    @PutMapping("/update/{id}")
    public EmployeeResponseDto updatemployee(@PathVariable int id , @RequestBody EmployeeReuestDto employeeReuestDto){

        return  employeService.update(id,employeeReuestDto);
    }

    @PostMapping("add")
    public String addEmployee(@RequestBody EmployeeReuestDto employeeReuestDto){
        return employeService.add(employeeReuestDto);
    }
}
