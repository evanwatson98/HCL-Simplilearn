package project.hcl.FileHandling;

import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		FileHandling test = new FileHandling();
		
//		test.createFile();
		
		test.readCSV("test.csv");
//		test.getCsvInput();
	}
}
