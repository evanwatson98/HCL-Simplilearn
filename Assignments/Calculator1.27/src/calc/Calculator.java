package calc;

import java.util.Scanner;

public class Calculator {
	
	//made this an array so you can add any additional operators easily and explicitly
//	private static String[] operations = {"+", "-", "*", "/", "off"};

	public double addition(double x, double y) {
		double add = x + y;
		return add; 
	}
	
	public double subtraction(double x, double y) {
		double sub = x - y;
		return sub; 
	}
	
	public double muliplication(double x, double y) {
		double mul = x * y;
		return mul; 
	}
	
	public double division(double x, double y) {
		double div = x / y;
		return div; 
	}
	
	public boolean checkOperation(String o, String[] operations) {
		 for (String element : operations) { 
            if (element.equals(o)) { 
            	return true;
            } 
		 }
		 return false;
	}
	
	
	public boolean turnOff(String o, Scanner s) {
		if(o.equals("off")) {
			s.close();
			System.exit(1);
			return true;
		}
		return false;
	}
	
	
}
