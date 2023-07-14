package com.terzocloud.employeez.repository;

import com.terzocloud.employeez.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
