package com.terzocloud.employeez.service.impl;

import com.terzocloud.employeez.dto.EmployeeDto;
import com.terzocloud.employeez.entity.Department;
import com.terzocloud.employeez.entity.Employee;
import com.terzocloud.employeez.exception.EmployeeNotFoundException;
import com.terzocloud.employeez.repository.EmployeeRepository;
import com.terzocloud.employeez.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.terzocloud.employeez.mapper.EmployeeMapper.mapToEmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    //add service annotation

    //declare repository
    private EmployeeRepository employeeRepository;

    //inject repository using autowired
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeDto> findAll() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDto> employeeDtos = employees.stream()
                .map(employee -> mapToEmployeeDto(employee))
                .collect(Collectors.toList());
        return employeeDtos;
    }

    @Override
    public EmployeeDto findById(Integer employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        EmployeeDto employeeDto = null;
        if(employee.isPresent())
        {
            employeeDto = mapToEmployeeDto(employee.get());
        }
        return employeeDto;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeDto update(Employee employee) {
        Employee dbRepository = employeeRepository.save(employee);
        return mapToEmployeeDto(dbRepository);
    }

    @Override
    public void delete(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public Department findDepartment(Integer employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if(employee.isPresent()){
            Employee dbEmployee = employee.get();
            return dbEmployee.getDepartment();
        }
        else {
            throw new EmployeeNotFoundException("Employee not found");
        }
    }
}
