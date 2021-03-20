package com.example.UserFeedback.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserFeedback.entities.Feedback;
import com.example.UserFeedback.repositories.*;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
//	public Iterable<Feedback> GetAllFeedback() {
//		return feedbackRepository.findAll();
//	}
	    
//	    public Feedback GetUserById(int id) throws Exception {
//	    	Optional<Feedback> foundUser = feedbackRepository.findById(id);
//	    	
//	    	//TODO: we need to decide how to handle a "Not Found" condition
//	    	
//	    	if (!foundUser.isPresent()) {
//	    		throw new Exception();
//	    	}
//	    	
//	    	return(foundUser.get());
//	    }
	    
	    public void UpdateUser(Feedback usertoUpdate) {
	    	feedbackRepository.save(usertoUpdate);
	    }
	    
	    public Feedback save(Feedback user) {
	    	Feedback foundUser = feedbackRepository.save(user);
	    	
	    	return foundUser;
	    }
	

}
