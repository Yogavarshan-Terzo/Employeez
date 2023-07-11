package com.terzocloud.employeez.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String firstname;
    private String lastname;
    @Column(nullable = false)
    private String email;
    private LocalDate dateOfBirth;
    private LocalDate joinedOn;
    private String designation;
    private String address;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Long mobile;
    private String photoUrl;
    @OneToOne
    private LeaveInfo leaveInfo;
    @OneToMany
    @JsonBackReference
    private List<Leave> leaves;
    @ManyToOne
    @JsonBackReference
    private Department department;
    @Column(nullable = true)
    private int reportTo;
    @ManyToMany(targetEntity = Role.class,fetch = FetchType.EAGER)
    @JoinTable(
            joinColumns = {@JoinColumn(referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(referencedColumnName = "id")}
    )
    private List<Role> roles;

}
