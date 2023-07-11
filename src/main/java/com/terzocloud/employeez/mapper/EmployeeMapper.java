package com.terzocloud.employeez.mapper;

import com.terzocloud.employeez.dto.EmployeeDto;
import com.terzocloud.employeez.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        EmployeeDto employeeDto = EmployeeDto.builder()
                .id(employee.getId())
                .firstname(employee.getFirstname())
                .lastname(employee.getLastname())
                .designation(employee.getDesignation())
                .address(employee.getAddress())
                .email(employee.getEmail())
                .dateOfBirth(employee.getDateOfBirth())
                .photoUrl(employee.getPhotoUrl())
                .mobile(employee.getMobile())
                .joinedOn(employee.getJoinedOn())
                .department(employee.getDepartment())
                .build();
        return employeeDto;
    }
}
