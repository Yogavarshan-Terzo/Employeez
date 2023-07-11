package com.terzocloud.employeez.service;

import com.terzocloud.employeez.dto.AuthenticationDto;
import com.terzocloud.employeez.dto.LoginDto;
import com.terzocloud.employeez.entity.Employee;
import com.terzocloud.employeez.entity.UserDetailsDto;
import com.terzocloud.employeez.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    JwtService jwtService;
    AuthenticationManager authenticationManager;
    EmployeeRepository employeeRepository;
    @Autowired
    public LoginService(JwtService jwtService, AuthenticationManager authenticationManager,EmployeeRepository employeeRepository) {
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
        this.employeeRepository = employeeRepository;
    }

    public AuthenticationDto authenticate(LoginDto loginDto) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getEmail(),
                        loginDto.getPassword()
                )
        );
        Employee employee =  employeeRepository.findByEmail(loginDto.getEmail());
        return AuthenticationDto.builder()
                .jwt(jwtService.generateToken(new UserDetailsDto(employee)))
                .build();
    }
}
