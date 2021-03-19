package com.hcl.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.enitites.Feedback;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{
	public Feedback findByName(String name);
    public Feedback save(String sql);
    public Feedback getAllFeedbacks();
}
