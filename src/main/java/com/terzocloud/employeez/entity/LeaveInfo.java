package com.terzocloud.employeez.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LeaveInfo {
    @Id
    private Long id;
    private int sick;
    private int earned;
    private int paternity;
    @OneToOne(mappedBy = "leaveInfo")
    private Employee employee;
}
