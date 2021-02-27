package com.hcl.screens;

import java.io.File;

//import com.hcl.entities.*;

import java.io.IOException;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import com.hcl.entities.Mdirectory;

public class Welcome {
	public static final Scanner in = new Scanner(System.in);
	int option = 0;
	
	//if I want to add/remove an option then I can make reference to this variable in another file. This allows me to close the 
	//program in a safer way.
	int closeOption = 3;
	
	Mdirectory mainDir = new Mdirectory();
	
	//Set up the main directory to work from
	public void buildMainDir() {
		mainDir.grabFiles();
	}
	
	public void display() throws IOException {
		buildMainDir();
		System.out.println("                                         _______    _____");
		System.out.println("\\              /  | | | | |  |          /          /     \\       /\\    /\\        | | | | |");
		System.out.println(" \\            /   |          |         /          /       \\     /  \\  /  \\       |");
		System.out.println("  \\   / \\   /     | | | |    |         \\          \\       /    /    \\/    \\      | | | |");
		System.out.println("   \\ /   \\ /      |          |          \\          \\     /    /            \\     |");
		System.out.println("    \\     \\       | | | | |  | | | | |   \\_______   \\___/    /              \\    | | | | |");
		System.out.println("");
		System.out.println("Developer: Evan Watson\n");
		
		//Keep asking the user what option they want from the home screen
        while(option != closeOption) {
        	System.out.println("      ___            ____");
        	System.out.println("|__| |   |  /\\  /\\  |__");
        	System.out.println("|  | |___| /  \\/  \\ |____\n");

        	System.out.println("Please choose an option");
    		System.out.println("Option #1: Display Ordered Files \nOption #2: File Manager \nOption #3: Close App");
        	
			option = getUserInput();
			
			switch(option) {
				//user put an invalid input (String format)
				case 0: 
					System.err.println("Wrong: Improper format, please try again");
					break;
				//Sort Files
				case 1: 
					LinkedList<File> files = mainDir.getFiles();
					//Files are already ordered by default since I am grabbing directly from the file list
					//However when I add a file in this program, I do not reload the LinkedList, I append it
					Collections.sort(files);
					mainDir.printFiles();
					break;
				//Open the file manager screen
				case 2:
					FileManager manage = new FileManager(mainDir);
					int manDisplay = manage.display();
					if(manDisplay == 5) {
						option = closeOption;
					}
					break;
				//Turn off application
				case 3: 
					break;
				//Choice is a valid input tyoe(an integer), but is not a valid choice to pick from
				default:
		            System.err.println("You have made an invalid choice!...try again");
		            break;
			}
        }
        //Close scanner
        in.close();
		
	}
	
	//Grab and Validate user input 
	private int getUserInput() {
		
		int option;
		
		try {
        	option = in.nextInt();
        }catch (InputMismatchException e) {
        	in.next();
        	option = 0;
        }
		return option;
	}
	
	
	public void setOption(int op) {
		this.option = op;
	}
	
	//If I want to add/remove an option, the close option will be changed. The close option will help with a clean exit when a sub screen is closing the program.
	public int getCloseOption() {
		return this.closeOption;
	}
}
