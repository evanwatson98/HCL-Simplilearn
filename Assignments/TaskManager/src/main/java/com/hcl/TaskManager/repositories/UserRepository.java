package com.hcl.TaskManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.TaskManager.models.UserCred;

@Repository
public interface UserRepository extends JpaRepository<UserCred, Long> {
	UserCred findByEmail(String email);
	UserCred findByUserName(String userName);
}
