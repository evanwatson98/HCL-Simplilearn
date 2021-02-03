package com.hcl.validation;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------");
		System.out.println("Test Cases");
		System.out.println("------------------------------------------");
		String[] testEmails = {"evan@mailcom", "evanmail.com", "evanmailcom", "evanwatson98@gmail.com"};
		ValidateEmail valEmail = new ValidateEmail();
		for(String email:testEmails) {
			valEmail.validateInput(email,false);
		}
		System.out.println("\n");
		System.out.println("------------------------------------------");
		System.out.println("User Input");
		System.out.println("------------------------------------------");
		if(args.length <= 1) {
			valEmail.getInput();
		}
	}

}
