package com.hcl.screens;

import java.io.File;
import java.io.IOException;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import com.hcl.entities.*;
//import com.hcl.screens.*;

public class FileManager {

	Mdirectory mainDir = new Mdirectory();
	public FileManager(Mdirectory mainDir) {
		this.mainDir = mainDir;
	}
	
	public int display() throws IOException {
	    LinkedList<File> files = mainDir.getFiles();

		Scanner in = Welcome.in;
		
		int option = 0;
        while(option != 4) {
        	
        	System.out.println(" ___ o      ___");
        	System.out.println("|__  | |   |_");
        	System.out.println("|    | |__ |___");

        	System.out.println("\nFFFFFFFFFFFFFFFFFFFFFFFF\nManage Files\nFFFFFFFFFFFFFFFFFFFFFFFF");
    		System.out.println("File Option #1: Add File \nFile Option #2: Delete File\nFile Option #3: Search\nFile Option #4: Go Home\nFile Option #5: Close App");
    		
    		
			try {
	        	option =  in.nextInt();
	        }catch (InputMismatchException e) {
	        	in.next();
	        	option = 0;
	        }
			//Pick a task
			switch(option) {
				//User input a wrong format
				case 0:
					System.err.println("Wrong: Improper format, please try again");
					break;
				//Add a new file
				//Run on Separate thread?
				case 1: 
					AddFile addFile = new AddFile(mainDir);
					addFile.create();
					break;
				//Delete an Existing File
				//Run on Separate thread?
				case 2:
					DeleteFile deleteFile = new DeleteFile(mainDir);
					deleteFile.delete();
					break;
				//Search for a file
				case 3:
					Search search = new Search();
					search.find(mainDir);
				    
					break;
				//Go Home
				case 4:
					break;
				//Close program entirely
				case 5:
//					parent.setOption(parent.getCloseOption());
//					option = 4;
					return option;
				//Not a valid number to pick from
				default:
		            System.err.println("You have made an invalid choice!");
		            break;
			}
        }
        return option;

	}
}
