package com.terzocloud.employeez.repository;

import com.terzocloud.employeez.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
