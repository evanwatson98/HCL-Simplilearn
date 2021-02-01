package com.hcl.validation;

public class Main {

	public static void main(String[] args) {
		if(args.length <= 1) {
			ValidateEmail valEmail = new ValidateEmail();
			valEmail.getInput();
		}
	}

}
