package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.hcl.controllers.LoginController;
import com.hcl.entites.User;
import com.hcl.exceptions.UserNotFoundException;
import com.hcl.services.UserService;
import com.hcl.repositories.UserRepository;

@Import({
	LoginController.class,
    UserNotFoundException.class,
    UserService.class,
    User.class
})
@SpringBootApplication
public class AuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}

}
