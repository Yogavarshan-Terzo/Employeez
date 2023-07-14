package com.terzocloud.employeez.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terzocloud.employeez.entity.Department;
import com.terzocloud.employeez.entity.Leave;
import com.terzocloud.employeez.entity.LeaveInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
    private String firstname;
    private String lastname;
    private String email;
    private LocalDate dateOfBirth;
    private LocalDate joinedOn;
    private String designation;
    private String address;
    private String password;
    private Long mobile;
    private String photoUrl;
    private int reportTo;
    private int deptId;
    private int roleId;
    private int teamId;
}
