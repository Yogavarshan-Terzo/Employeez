package com.terzocloud.employeez.dto;

import com.terzocloud.employeez.entity.Department;
import lombok.*;

import java.time.LocalDate;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private LocalDate dateOfBirth;
    private LocalDate joinedOn;
    private String designation;
    private String address;
    private Long mobile;
    private String photoUrl;
    private Department department;
}
