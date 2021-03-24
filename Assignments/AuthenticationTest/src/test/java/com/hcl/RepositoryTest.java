package com.hcl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.hcl.entites.User;
import com.hcl.repositories.UserRepository;

@DataJpaTest
public class RepositoryTest {
	
	@Autowired
	private TestEntityManager tem;
	
	@Autowired
	UserRepository repository;
	
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
	void testRepo_findByEmail() {
		User user = repository.findByEmail("test@gmail.com");
		assertEquals(user.getEmail(), "test@gmail.com");
	}
	
	@Test
	void testEntity_getEmail(){
		User user = repository.findByEmail("test@gmail.com");
		assertEquals(user.getEmail(), "test@gmail.com");
	}
	
	@Test
	void testEntity_getPassword() {
		User user = repository.findByEmail("test@gmail.com");
		assertEquals(user.getPassword(), "test");
	}

	@Test
	void testEntity_getId() {
		User user = repository.findByEmail("test@gmail.com");
		assertEquals(user.getId(), 5);
	}
	
	@Test
	void testEntity_getName(){
		User user = repository.findByEmail("test@gmail.com");
		assertEquals(user.getName(), "Evan");
	}
}
