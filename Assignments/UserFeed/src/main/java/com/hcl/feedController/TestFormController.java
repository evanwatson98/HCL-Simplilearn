package com.hcl.feedController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.enitites.Feedback;
import com.hcl.services.FeedbackService;


@Controller
public class TestFormController {

	FeedbackService feedbackService;
//	 @GetMapping(value="/testform")
//     public Iterable<Feedback> showTestForm(ModelMap model) {
//		 //TODO: Create a JSP called "testformjsp.jsp"  
//		 return feedbackService.GetAllFeedback();
//     }
	 
}
