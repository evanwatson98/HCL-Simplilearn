package calc;
import java.io.*; 

public class Calculator {
	public static void main(String[] args) throws IOException {
		InputStream in = null; 
        try { 
  
        	in = new FileInputStream("ABC.txt"); 
        }catch(Exception excpt) 
        { 
            // in case of I/O error 
            excpt.printStackTrace(); 
        } finally
        { 
            // releasing the resources back to the 
            // GarbageCollector when closes 
            if (in!=null) 
            { 
                // Use of close() : closing the file 
                // and releasing resources 
            	in.close(); 
            } 
        } 
	}
}
