package com.hcl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.enitites.Feedback;
import com.hcl.repositories.FeedbackRepository;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackRepository;
		    
	    public void UpdateUser(Feedback usertoUpdate) {
	    	feedbackRepository.save(usertoUpdate);
	    }
	    
	    public Feedback save(Feedback user) {
	    	feedbackRepository.save(user);
	    	
	    	return user;
	    }

		public Iterable<Feedback> GetAllFeedbacks() {
			// TODO Auto-generated method stub
			return feedbackRepository.findAll();
		}
	

}
