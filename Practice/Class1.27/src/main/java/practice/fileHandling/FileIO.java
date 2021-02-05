package practice.fileHandling;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.*;
 
public class FileIO {
	
	public boolean WriteFileStream(String textToWrite, String fileName) throws IOException {
		try ( PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(fileName)))){
			Stream.of(textToWrite).forEach(pw::println);
			pw.close();
		}catch(IOException ex) {
			System.err.println(ex.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean ReadFileStream(String fileName) {
		try {
			Stream<String> str = Files.lines(Paths.get(fileName));
			str.forEach(null);
			for(String line :str.collect(Collectors.toList())){
				System.out.println(line);
			}
			str.close();
		}catch(IOException ex) {
			System.err.println(ex.getMessage());
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		
//		test.getCsvInput();
	}
}
