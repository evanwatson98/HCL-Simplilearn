package com.hcl.feedController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.enitites.Feedback;
import com.hcl.services.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	FeedbackService feedbackService;
	
    Logger logger = LoggerFactory.getLogger(FeedbackController.class);

	@GetMapping("/feedback")
	public @ResponseBody Iterable<Feedback> getAllFeedbacks() {
        // This returns a JSON or XML with the Feedbacks
        return feedbackService.getAllFeedbacks();
    }
	
	//MediaType.APPLICATION_PROBLEM_JSON_VALUE
	@PostMapping(value="/feedback", consumes = "application/json")
	public Feedback addNewFeedback(@RequestParam(value="username", required=false, defaultValue="") String username, @RequestParam(value="rating", required=false, defaultValue="") int rating, @RequestParam(value="comment", required=false, defaultValue="") String comment) {
		// TODO: Do something useful here.  
		// Add the Feedback.
		Feedback newFeedback = new Feedback();
		
		newFeedback.setComments(comment);
		newFeedback.setRating(rating);
		newFeedback.setUser(username);
		
		logger.info("addNewFeedback ==================================================================================" + newFeedback.toString());
		return feedbackService.save(newFeedback);  // Change this.
	}
}


