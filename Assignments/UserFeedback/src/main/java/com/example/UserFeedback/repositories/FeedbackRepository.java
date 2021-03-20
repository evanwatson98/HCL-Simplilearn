package com.example.UserFeedback.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.UserFeedback.entities.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{
	public Feedback findByName(String name);
    public Feedback save(String sql);
}
