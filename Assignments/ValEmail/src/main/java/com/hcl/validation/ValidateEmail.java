package com.hcl.validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//check if user input is a valid email
//Search array for email

public class ValidateEmail {
	//stored emails to check
	private static String[] emails = {"evanwatson98@gmail.com", "test@mail.com", "coder@yahoo.com", "oldschool@aol.com", "work@hcl.com", "organization@test.org"};
	
	//Get user input
	Scanner scan = new Scanner(System.in);
	
	public void getInput() {
		System.out.print("Search email named: ");
//		Scanner scan = new Scanner(System.in);
		validateInput(scan.next(), true);
	}
	
	public void validateInput(String email, Boolean isUser) {
		String reg = ".+\\@.+(\\..+)+";
//		Pattern pat = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
		
		Pattern pat = Pattern.compile(reg);
		Matcher mat = pat.matcher(email);
		System.out.println(email + ": " + mat.matches());
		boolean val = false;
		while(!val && isUser) {
			if(mat.matches()) {
				val = true;
				searchEmails(email);
				scan.close();
			}else {
				System.err.println("Not valid...Retry please");
				System.out.print("Search email named: ");
				email = scan.next();
			}
			pat = Pattern.compile(reg);
			mat = pat.matcher(email);
		}
	}

	private void searchEmails(String email) {
		
		for(String e:emails) {
			if(e.equals(email)) {
				System.out.println("Found email!");
				return;
			}
		}
		System.out.println("No email found!");
	}

}
