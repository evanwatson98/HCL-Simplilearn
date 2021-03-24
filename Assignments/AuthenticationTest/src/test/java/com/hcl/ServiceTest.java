package com.hcl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.entites.User;
import com.hcl.services.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;



//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMocMvc

@DataJpaTest
public class ServiceTest {

	@Autowired
	private TestEntityManager tem;
	
	@Autowired
	private UserService userService;
	
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
	void testSevice_GetUserByEmail() {
		User user = userService.GetUserByEmail("test@gmail.com");
		assertEquals(user.getEmail(),"test@gmail.com");
	}
	
	//////////////////////////////////////////////////////////
	/// 	Future Test Cases(Not needed for project)	  ///
	/////////////////////////////////////////////////////////
//	@Test
//	void testSevice_UpdateUser() {
//		User user = new User();
//		user.setEmail("test@email.com");
//		user.setName("Tester");
//		user.setPassword("123");
//		
//		userService.UpdateUser(user);
//	}
	
//	@Test
//	void testServiceCall() {
//		Iterable<User> users = userService.GetAllUsers();
//		
//		int c =0;
//		for(User u: users) {
//			c++;
//		}
//		assertNotEquals(c,0);
//	}
}
