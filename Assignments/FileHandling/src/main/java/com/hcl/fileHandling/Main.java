package com.hcl.fileHandling;

import java.io.IOException;

//import org.apache.logging.log4j.LogManager;

public class Main {

	public static void main(String[] args) throws IOException {
		FileHandling test = new FileHandling();
		String[] tt = {"one", "two", "three"};
		
//		test.convertToCSV(tt);
//		test.writeCSV();
		test.getCsvInput();
	}

}
