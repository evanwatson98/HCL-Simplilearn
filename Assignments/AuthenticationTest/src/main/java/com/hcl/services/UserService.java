package com.hcl.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entites.User;
import com.hcl.exceptions.UserNotFoundException;
import com.hcl.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

   public Iterable<User> GetAllUsers()
   {
       return userRepository.findAll();
   }
   
   public User GetUserByEmail(String email) {
       User foundUser = userRepository.findByEmail(email);
       return foundUser;
   }
   
   public void UpdateUser(User usertoUpdate) {
   	userRepository.save(usertoUpdate);
   }

}