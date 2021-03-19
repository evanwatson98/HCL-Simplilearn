package com.hcl.feedController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.enitites.Feedback;
import com.hcl.services.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	FeedbackService feedbackService;
	
//	static Logger log = (Logger) LoggerFactory.getLogger(FeedbackController.class);
	
//	private static Logger logger = LogManager.getLogger(FeedbackController.class);
	
	@GetMapping(value = "/feedback", produces = "application/json")
	public @ResponseBody Iterable<Feedback> getAllFeedbacks() {
        // This returns a JSON or XML with the Feedbacks
        return feedbackService.GetAllFeedbacks();
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
		
		return feedbackService.save(newFeedback);  // Change this.
	}
}
