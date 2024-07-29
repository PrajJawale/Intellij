package com.Employee1.Employee1.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeReuestDto {
    private int empId;
    private String empName;
    private String company;
    private String address;

}
