package com.hcl.TaskManager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.TaskManager.models.Task;
import com.hcl.TaskManager.models.UserCred;
import com.hcl.TaskManager.repositories.TaskRepository;

@Service
public class TaskService {
	
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Iterable<Task> GetAllTasks() {
	
		return taskRepository.findAll();
	}

	public Optional<Task> GetTaskById(Integer taskId) {
		
		//TODO: create exception for task not found.
		return taskRepository.findById(taskId);
	}
	
	public Iterable<Task> GetTasksByUser(UserCred user) {
		//TODO: what do we do if the user doesn't have any tasks or doesn't exist?
		
		return(taskRepository.findAllByUser(user));
	}

	public Task save(Task task) {
		// TODO Auto-generated method stub
		taskRepository.save(task);
		return task;
	}
	
	public Task delete(Task task) {
		// TODO Auto-generated method stub
		taskRepository.delete(task);
		return task;
	}
}
