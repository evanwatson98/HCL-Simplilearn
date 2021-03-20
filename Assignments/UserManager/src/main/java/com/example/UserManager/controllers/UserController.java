package com.example.UserManager.controllers;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.UserManager.entities.User;
import com.example.UserManager.services.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
    Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@GetMapping("/users")
	public String showUsers(ModelMap model) {
		
		
		logger.info("Getting all Users");
		Iterable<User> users = userService.GetAllUsers();
		
		logger.info("Passing users to view");
	    model.addAttribute("users", users);    
		
        return "users";
    }
	
	@PostMapping("/editUser")
	public String updateUser(ModelMap model, @RequestParam(value="userId", required=false, defaultValue="") int id, @RequestParam(value="email", required=false, defaultValue="") String email, @RequestParam(value="name", required=false, defaultValue="") String name, @RequestParam(value="password", required=false, defaultValue="") String password) {
		
		User user = userService.GetUserById(id);
		Iterable<User> users = Arrays.asList(user);
		user.setId(id);
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		userService.save(user);
		logger.info("Passing user to confirm view");
	    model.addAttribute("user", user);
	    
		return "confirm";
	}
	
	@PostMapping("/users")
	public String getUserById(ModelMap model, @RequestParam(value="userId", required=false, defaultValue="") int id) {
		User user = userService.GetUserById(id);
		Iterable<User> users = Arrays.asList(user);
		
		
		logger.info("Passing users to update view");
	    model.addAttribute("user", user);
	    
		return "updateUser";
	}
}