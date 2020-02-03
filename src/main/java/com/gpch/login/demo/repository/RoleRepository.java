package com.gpch.login.demo.repository;

import com.gpch.login.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role);
}
