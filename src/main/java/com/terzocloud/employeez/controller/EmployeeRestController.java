package com.terzocloud.employeez.controller;

import com.terzocloud.employeez.dto.EmployeeDto;
import com.terzocloud.employeez.entity.Department;
import com.terzocloud.employeez.entity.Employee;
import com.terzocloud.employeez.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {

    //declare employeeService
    private EmployeeService employeeService;
    //inject employeeService
    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    //list all employees
    @GetMapping("/employees")
    public List<EmployeeDto> findAllEmployees(){
        List<EmployeeDto> employees = employeeService.findAll();
        return employees;
    }
    //find employee by id
    @GetMapping("/employees/{employeeId}")
    public EmployeeDto findEmployeeById(@PathVariable Integer employeeId){
        EmployeeDto employee = employeeService.findById(employeeId);
        return employee;
    }
    //add an Employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
    //update an Employee
    @PutMapping("/employees")
    public EmployeeDto updateEmployee(@RequestBody Employee employee){
        return employeeService.update(employee);
    }
    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId){
        employeeService.delete(employeeId);
    }

    @GetMapping("/employees/dept/{employeeId}")
    public Department  findDepartment(@PathVariable Integer employeeId){
        return employeeService.findDepartment(employeeId);
    }
}
