package com.terzocloud.employeez.mapper;

import com.terzocloud.employeez.dto.DepartmentDto;
import com.terzocloud.employeez.entity.Department;

public class DepartmentMapper {
    public static DepartmentDto mapToDepartmentDto(Department department){
        DepartmentDto departmentDto = DepartmentDto.builder()
                .id(department.getId())
                .name(department.getName())
                .employeesCount(department.getEmployees().size())
                .build();
        return departmentDto;
    }
}
