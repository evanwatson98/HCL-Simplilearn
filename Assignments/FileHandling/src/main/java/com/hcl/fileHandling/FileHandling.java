package com.hcl.fileHandling;

import java.io.FileWriter; 
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import com.opencsv.CSVWriter;

import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
	
	ArrayList<ArrayList<String>> rows = new ArrayList<ArrayList<String>>();
	ArrayList<String> headers = new ArrayList<String>();
	
	//Get User input for rows and headers of the CSV
	public void getCsvInput() throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		//Get header input
		int c = 1;
		System.out.println("What Are the CSV Headers? Input D when done inputting");
		System.out.println("----------------------------------------------------");
		System.out.print("Header " + c + ": ");
		String input = scan.nextLine();
		while(!input.equals("D")) {
			c++;
			System.out.print("Header " + c + ": ");
			headers.add(input);
			input = scan.nextLine();
		}
		
		//Get Row input
		c=1;
		System.out.println(headers.toString());
		System.out.println("What Is the CSV Rows? Input D when done inputting");
		System.out.println("----------------------------------------------------");
		input = "";
		while(!input.equals("D")) {
			System.out.println("Row " + c);
			System.out.println(new String(new char[headers.size()]).replace("\0", "|"));
			
			ArrayList<String> row = new ArrayList<String>();
			int i = 0;
			while((i<headers.size()) && (!input.equals("D"))) {
				System.out.print(headers.get(i) + ": ");
				input = scan.nextLine();
				row.add(input);
				i++;
			}
			System.out.println();
			c++;
			rows.add(row);
		}
		
		System.out.println(headers.toString());
		scan.close();
		
		writeCSV();
	}
	
	//Write to an existing csv
	public void writeCSV() throws IOException {
		
		try {
			Path path = FileSystems.getDefault().getPath("src/main/resources/comments.csv").toAbsolutePath();
			System.out.println(path.toString());
			// create FileWriter object with file as parameter 
	        FileWriter outputfile = new FileWriter(path.toFile(), true); 
	        System.out.println("File" + path.toString());
	        // create CSVWriter object filewriter object as parameter 
	        CSVWriter writer = new CSVWriter(outputfile); 
	  
	        // adding header to csv 
	        writer.writeNext(headers.toArray(new String[headers.size()])); 
	  
	        // add data to csv 
	        int i=0;
	        while(i<rows.size()) {
	        	String[] data = rows.get(i).toArray(new String[rows.size()]);
	        	writer.writeNext(data);
	        	i++;
	        }
	  
	        // closing writer connection 
	        writer.close(); 
		}catch (IOException e){
			System.out.println(e);
		}
	}

	public void readFile() {

	}
}
