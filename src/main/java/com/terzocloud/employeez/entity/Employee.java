package com.terzocloud.employeez.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;
import java.util.Date;
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
    private Date dateOfBirth;
    private Date joinedOn;
    private String designation;
    private String address;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Long mobile;
    private String photoUrl;
    @ManyToMany(targetEntity = Role.class,fetch = FetchType.EAGER)
    @JoinTable(
            joinColumns = {@JoinColumn(referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(referencedColumnName = "id")}
    )
    private List<Role> roles;

}
