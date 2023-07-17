package com.terzocloud.employeez.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terzocloud.employeez.entity.Employee;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppliedLeaveDto {
    private Long id;
    private LocalDate applyOn;
    private String type;
    private String note;
    private Boolean isApproved;
    private EmployeeDto employeeDto;
}
