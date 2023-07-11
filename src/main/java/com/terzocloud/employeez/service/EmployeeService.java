package com.terzocloud.employeez.service;

import com.terzocloud.employeez.dto.EmployeeDto;
import com.terzocloud.employeez.entity.Department;
import com.terzocloud.employeez.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> findAll();

    EmployeeDto findById(Integer employeeId);

    Employee save(Employee employee);

    EmployeeDto update(Employee employee);

    void delete(Integer employeeId);

    Department findDepartment(Integer employeeId);
}
