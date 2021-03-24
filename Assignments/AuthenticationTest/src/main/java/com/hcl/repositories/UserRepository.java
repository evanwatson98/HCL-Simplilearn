package com.hcl.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entites.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    
    public User findByEmail(String Name);
    
}
