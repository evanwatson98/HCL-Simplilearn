package com.hcl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.entites.User;
import com.hcl.services.UserService;

@SpringBootTest
public class EntityTest {
	
	@Autowired
	private TestEntityManager tem;
	
	@Autowired
	UserService userService;
	
	User user;
	
	@BeforeEach
	void addMockData() {
		User user = new User();
		user.setEmail("test@gmail.com");
		user.setName("Evan");
		user.setPassword("test");
		tem.persist(user);
		tem.flush();
	}
	
	@Test
	void testEntity_getPassword() {
		userService.GetUserByEmail("test@gmail.com");
		assertEquals(user.getPassword(), "test");
	}

	@Test
	void testEntity_getId() {
		userService.GetUserByEmail("test@gmail.com");
		assertEquals(user.getId(), 1);
	}
	
	@Test
	void testEntity_getName(){
		userService.GetUserByEmail("test@gmail.com");
		assertEquals(user.getName(), "Evan");
	}
	
	@Test
	void testEntity_getEmail(){
		userService.GetUserByEmail("test@gmail.com");
		assertEquals(user.getEmail(), "test@gmail.com");
	}
	
//	@Test
//	void testEntity_setId(){
//		
//	}
//	@Test
//	void testEntity_setPassword() {
//		
//	}
//	@Test
//	void testEntity_setName() {
//		
//	}
//	@Test
//	void testEntity_setEmail() {
//		
//	}
//	@Test
//	void testEntity_toString() {
//		
//	}
}
