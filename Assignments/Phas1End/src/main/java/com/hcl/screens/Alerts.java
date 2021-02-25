package com.hcl.screens;
import java.util.Scanner;

//import  com.hcl.screens.*;
public class Alerts {

	Scanner in = Welcome.in;
	public boolean deleteFile(String fileName) {
		String option = "";
		while(!option.equals("Y")) {
			System.out.println("WARNING: You are about to delete " + fileName + " is this correct?(Type Y or N?");
			option = in.next();
			if(option.equals("Y")) {
				return true;
			}else if(option.equals("N")) {
				//Break 
				return false;
			}else {
				System.err.println("Invalid Option, try again");
			}
			
		}
		return false;
	}
	
	public boolean turnOff() {
		String option = "";
		while(!option.equals("Y")) {
			System.out.println("Are you sure you want Turn the application off?(Type Y or N?");
			option = in.next();
			if(option.equals("Y")) {
				return true;
			}else if(option.equals("N")) {
				//Break 
				return false;
			}else {
				System.err.println("Invalid Option, try again");
			}
			
		}
		return false;
	}
}
