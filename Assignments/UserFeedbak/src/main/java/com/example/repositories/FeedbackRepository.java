package com.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{

}