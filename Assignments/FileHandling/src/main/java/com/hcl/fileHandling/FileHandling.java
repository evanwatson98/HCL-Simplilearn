package com.hcl.fileHandling;

import java.io.FileWriter; 
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.stream.Collectors;
//import org.apache.logging.log4j.LogManager;
import java.util.stream.Stream;
import com.opencsv.CSVWriter;

//import java.awt.List;
//import java.io.BufferedReader;
//import java.io.File;
//import javax.sound.sampled.DataLine;
//import java.util.stream.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.io.PrintWriter;

public class FileHandling {
//	/HCL/src/main/resources/comments.csv
	
	public void writeCSV() throws IOException {
		
		try {
			Path path = FileSystems.getDefault().getPath("test.csv").toAbsolutePath();
			// create FileWriter object with file as parameter 
	        FileWriter outputfile = new FileWriter(path.toFile()); 
	        System.out.println("File" + path.toString());
	        // create CSVWriter object filewriter object as parameter 
	        CSVWriter writer = new CSVWriter(outputfile); 
	  
	        // adding header to csv 
	        String[] header = { "Name", "Class", "Marks" }; 
	        writer.writeNext(header); 
	  
	        // add data to csv 
	        String[] data1 = { "Aman", "10", "620" }; 
	        writer.writeNext(data1); 
	        String[] data2 = { "Suraj", "10", "630" }; 
	        writer.writeNext(data2); 
	        System.out.println("test");
	  
	        // closing writer connection 
	        writer.close(); 
		}catch (IOException e){
			System.out.println(e);
		}
		
//		try {
//			Path path = FileSystems.getDefault().getPath("comments.csv").toAbsolutePath();
//			String csv = path.toString();
//
//			ArrayList<ArrayList<String>> rows = new ArrayList<ArrayList<String>>();
//
//				FileWriter csvWriter = new FileWriter("new.csv");
//				csvWriter.append("Name");
//				csvWriter.append(",");
//				csvWriter.append("Role");
//				csvWriter.append(",");
//				csvWriter.append("Topic");
//				csvWriter.append("\n");
//				
//				File csvOutputFile = new File(csv);
//			    try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
//			        dataLines.
//			        stream()
//			          .map(this::convertToCSV)
//			          .forEach(pw::println);
//			    }
////			    assertTrue(csvOutputFile.exists());
//
//				csvWriter.flush();
//				csvWriter.close();
//				System.out.println("ran");
//		} catch (IOException e){
//			System.out.println(e);
//		}
	}
	
	public String convertToCSV(String[] data) {
		System.out.println(Stream.of(data).collect(Collectors.joining(",")));
	    return Stream.of(data)
//	      .map(this::escapeSpecialCharacters)
	      .collect(Collectors.joining(","));
	}
	
	public void readFile() {
//		BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
//		while ((row = csvReader.readLine()) != null) {
//		    String[] data = row.split(",");
//		    // do something with the data
//		}
//		csvReader.close();
	}
}
