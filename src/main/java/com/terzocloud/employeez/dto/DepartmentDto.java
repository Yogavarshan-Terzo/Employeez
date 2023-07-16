package com.terzocloud.employeez.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentDto {
    private int id;
    private String name;
    private int employeesCount;
}
