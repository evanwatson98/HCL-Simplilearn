package calc;
import java.util.Arrays;
import java.util.Scanner; 

//I inherited from Calculator just in case additional calculators are wanted
// Ex. Graphing, Scientific, Accounting etc.
public class SimpleCalculator extends Calculator{

	public static void main(String[] args) {
		
		System.out.println("Welcome to Evan's Calculator! You can turn off the calculator by typing \"off\" at any point");
		Calculator simpleCalc = new Calculator();
		String[] operations = simpleCalc.getOperations();
		
		//User Input
		Scanner scan = new Scanner(System.in);
		String oper = "";
		double baseNum = 0.0;
		
		//Get starting number
		System.out.print("Enter a number: ");
		//Check to see if the user has put in off
		try {
			baseNum = scan.nextInt();
		}catch(Exception e){
			String check = scan.next();
			simpleCalc.turnOff(check, scan);
		}
		
		
		while(true) {
			
			System.out.print("Pick a valid operation " + Arrays.toString(operations));
			oper = scan.next();
			//Check to see if the user input is a valid operation
			while(simpleCalc.checkOperation(oper) == false) {
				System.err.println("Invalid Operator Please Try again");
				System.out.print("Pick a valid operation " + Arrays.toString(operations) + ": ");
				oper = scan.next();
			}
			//Check to see if off was inputed as operation
			simpleCalc.turnOff(oper, scan);
			
			System.out.print("Enter a number: ");
			double num2 = 0.0;
			//Check to see if the user has put in off
			try {
				num2 = scan.nextInt();
			}catch(Exception e){
				String check = scan.next();
				simpleCalc.turnOff(check, scan);
			}
			
			double total = 0.0;
			switch (oper) {
				case "+":
					total = simpleCalc.addition(baseNum, num2);
					System.out.println("Total:" + total);
					baseNum = total;
					break;
				case "-":
					total = simpleCalc.subtraction(baseNum, num2);
					System.out.println("Total:" + total);
					baseNum = total;
					break;
				case "*":
					total = simpleCalc.muliplication(baseNum, num2);
					System.out.println("Total:" + total);
					baseNum = total;
					break;
				case "/":
					total = simpleCalc.division(baseNum, num2);
					System.out.println("Total:" + total);
					baseNum = total;
					break;
				default:
				    System.err.println("Invalid Operation");
			}
			
		}
	}
}
