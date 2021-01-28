package calc;

import java.util.Scanner;

public class Calculator {
	
	//made this an array so you can add any additional operators(Ex. graphing, accouunting, scientific calculators)
	private static String[] operations = {"+", "-", "*", "/", "off"};

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

	public String[] getOperations() {
		return operations;
	}

	public void setOperations(String[] operations) {
		Calculator.operations = operations;
	}
	
	public boolean checkOperation(String o) {
		 for (String element : operations) { 
            if (element.equals(o)) { 
            	return true;
            } 
		 }
		 return false;
	}
	
	
	public void turnOff(String o, Scanner s) {
		if(o.equals("off")) {
			s.close();
			System.exit(1);
		}
	}
	
	
}
