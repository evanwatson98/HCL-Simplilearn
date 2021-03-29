package com.hcl.TaskManager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hcl.TaskManager.models.Task;
import com.hcl.TaskManager.models.UserCred;

public interface TaskRepository extends CrudRepository<Task, Integer> {

    public Task findByName(String name);
    
    public Iterable<Task> findAllByUser(UserCred user);
}
