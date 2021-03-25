package com.hcl.SpringSecurity.repositories;

import org.springframework.stereotype.Repository;

import com.hcl.SpringSecurity.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByRole(String role);

}
