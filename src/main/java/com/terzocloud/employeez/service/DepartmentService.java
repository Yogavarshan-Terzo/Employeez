package com.terzocloud.employeez.service;

import com.terzocloud.employeez.dto.DepartmentDto;
import com.terzocloud.employeez.dto.EmployeeDto;
import com.terzocloud.employeez.entity.Department;
import com.terzocloud.employeez.entity.Employee;

import java.util.List;

public interface DepartmentService {
    List<DepartmentDto> findAll();

    Department findById(Integer departmentId);

    List<EmployeeDto> findAllEmployees(Integer departmenId);
}
