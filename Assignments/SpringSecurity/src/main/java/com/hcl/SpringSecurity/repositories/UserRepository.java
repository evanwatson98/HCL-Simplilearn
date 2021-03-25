package com.hcl.SpringSecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.SpringSecurity.models.UserCred;

@Repository
public interface UserRepository extends JpaRepository<UserCred, Long> {
	UserCred findByEmail(String email);
	UserCred findByUserName(String userName);
}
