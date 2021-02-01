package com.hcl.validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//check if user input is a valid email
//Search array for email

public class ValidateEmail {
	private static String[] emails = {"evanwatson98@gmail.com", "test@mail.com", "coder@yahoo.com", "oldschool@aol.com", "work@hcl.com", "organization@test.org"};
//	private static String[] valEmails = {"gmail.com", "yahoo,com", "mail.com", "aol.com", "hcl.com", "test.org"};
	
	public static String[] getEmails() {
		return emails;
	}


	public static void setEmails(String[] emails) {
		ValidateEmail.emails = emails;
	}
	
	public void getInput() {
		System.out.println("Search email named: ");
		Scanner scan = new Scanner(System.in);
		validateInput(scan.next());
		scan.close();
	}
	
	public void validateInput(String email) {
		String reg = ".+\\@.+(\\..+)+";
//		Pattern pat = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
		
		Pattern pat = Pattern.compile(reg);
		Matcher mat = pat.matcher(email);
		System.out.println(email + mat.matches());
		if(mat.matches()) {
			searchEmails(email);
		}else {
			System.out.println("Not valid");
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
