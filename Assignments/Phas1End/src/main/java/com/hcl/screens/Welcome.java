package com.hcl.screens;

//import com.hcl.entities.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.hcl.entities.Mdirectory;

public class Welcome {
	public static final Scanner in = new Scanner(System.in);
	int option = 0;
	
	//if I want to add/remove an option then I can make reference to this variable in another file. This allows me to close the 
	//program in a safer way.
	int closeOption = 3;
	
	Mdirectory mainDir = new Mdirectory();
	
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
		
		
//		Mdirectory mDirectory = new Mdirectory();
        while(option != closeOption) {
        	System.out.println("\nHHHHHHHHHHHHHHHHHHHH\nHome Page\nHHHHHHHHHHHHHHHHHHHH");
        	System.out.println("Please choose an option");
    		System.out.println("Option #1: Display Ordered Files \nOption #2: File Interface \nOption #3: Close App");
        	
			option = getUserInput();
			
			switch(option) {
				case 0: 
					System.err.println("Wrong: Improper format, please try again");
					break;
				case 1: 
					break;
				case 2:
					FileManager manage = new FileManager(mainDir);
					int manDisplay = manage.display();
					if(manDisplay == 5) {
						option = closeOption;
					}
					break;
				case 3: 
					break;
				default:
		            System.err.println("You have made an invalid choice!");
		            break;
			}
        }
        in.close();
		
	}
	
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
	
	public int getCloseOption() {
		return this.closeOption;
	}
}
