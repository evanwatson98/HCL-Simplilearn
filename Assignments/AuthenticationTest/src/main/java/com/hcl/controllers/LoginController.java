package com.hcl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.entites.User;
import com.hcl.services.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

    @GetMapping("/Signin")
    public String showLogin(ModelMap map,
    		@RequestParam(value="email", required=false, defaultValue="") String email,
    		@RequestParam(value="pwd", required=false, defaultValue="") String pwd) {
    	
    	User user = userService.GetUserByEmail(email); 
    	if(user.equals(null)) {
    		map.addAttribute("error", "Incorrect Information");
    		return "index";
    	}else if(!user.getPassword().equals(pwd)) {
    		map.addAttribute("error", "Incorrect Information");
    		return "index";
    	}
    	
        return "confirm";
    }

    @PostMapping("/Signup")
    public String submitLogin(ModelMap map, @RequestParam(value="newEmail", required=false, defaultValue="") String email, @RequestParam(value="newPassword", required=false, defaultValue="") String pwd, @RequestParam(value="fname", required=false, defaultValue="") String fname, @RequestParam(value="lname", required=false, defaultValue="") String lname){
    	
    	User nu = new User();
    	nu.setEmail(email);
    	nu.setPassword(pwd);
    	nu.setName(fname + lname);
    	userService.UpdateUser(nu);

        //TODO:
        return "confirm";
    }
}