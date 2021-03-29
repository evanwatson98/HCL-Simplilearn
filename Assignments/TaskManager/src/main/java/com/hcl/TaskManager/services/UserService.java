package com.hcl.TaskManager.services;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hcl.TaskManager.models.Role;
import com.hcl.TaskManager.models.UserCred;
import com.hcl.TaskManager.repositories.RoleRepository;
import com.hcl.TaskManager.repositories.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepo;
	private RoleRepository roleRepo;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	public UserService(UserRepository userRepo, RoleRepository roleRepo,
						BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepo = userRepo;
		this.roleRepo = roleRepo;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	public UserCred findUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	public UserCred findUserByUserName(String userName) {
		System.out.println("============================================ UserName" + userRepo.findByUserName(userName));

		return userRepo.findByUserName(userName);
	}
	
	public UserCred saveUser(UserCred userCred) {
		System.out.println("============================================" + userCred.getPassword());
		userCred.setPassword(bCryptPasswordEncoder.encode(userCred.getPassword()));
		userCred.setActive(true);
		Role userRole = roleRepo.findByRole("ADMIN");
		userCred.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		return userRepo.save(userCred);
		
	}

}
