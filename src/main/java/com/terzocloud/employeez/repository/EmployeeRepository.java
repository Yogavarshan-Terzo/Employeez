package com.terzocloud.employeez.repository;

import com.terzocloud.employeez.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("SELECT E FROM Employee E WHERE E.firstname LIKE CONCAT('%',:query,'%')")
    List<Employee> searchEmployees(String query, Pageable pageable);
    @Query("SELECT E FROM Employee E WHERE E.firstname LIKE CONCAT('%',:query,'%')")
    List<Employee> searchEmployees(String query);
    Employee findByEmail(String username);
}
