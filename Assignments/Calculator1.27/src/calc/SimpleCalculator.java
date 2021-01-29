package calc;
import java.util.Arrays;
import java.util.Scanner; 

//I inherited from Calculator just in case additional calculators are wanted
// Ex. Graphing, Scientific, Accounting etc.
public class SimpleCalculator extends Calculator{
	
		public void buildSimple() {
			System.out.println("Welcome to Evan's Simple Calculator! You can turn off the calculator by typing \"off\" at any point");
			String[] operations = this.getOperations();
			
			//User Input
			Scanner scan = new Scanner(System.in);
			String oper = "";
			double baseNum = 0.0;
			boolean isNum = false;
			
			//Get starting number
			System.out.print("Enter a number: ");
			//Get the starting Number
			while(!isNum) {
				try {
					System.out.print("Enter a number: ");
					baseNum = scan.nextDouble();
					isNum = true;
				}catch(Exception e){
					String check = scan.next();
					if(!this.turnOff(check, scan)) {
						System.err.println("Please put in a Real number...this is a simple calculator");
					}
				}
			}
			isNum = false;
			
			while(true) {
				
				System.out.print("Pick a valid operation " + Arrays.toString(operations));
				oper = scan.next();
				//Check to see if the user input is a valid operation
				while(this.checkOperation(oper) == false) {
					System.err.println("Invalid Operator Please Try again");
					System.out.print("Pick a valid operation " + Arrays.toString(operations) + ": ");
					oper = scan.next();
				}
				//Check to see if off was inputed as operation
				this.turnOff(oper, scan);
				
				double num2 = 0.0;
				//Check to see if the user has put in off
				while(!isNum) {
					try {
						System.out.print("Enter a number: ");
						num2 = scan.nextDouble();
						isNum = true;
					}catch(Exception e){
						String check = scan.next();
						if(!this.turnOff(check, scan)) {
							System.out.println("Please put in a Real number...this is a simple calculator");
						}
					}
				}
				isNum = false;
				
				//Try to check if the double can be converted to an Integer
				double total = 0.0;
				String totalText = baseNum +" "+ oper + " " + num2+ " = ";
				switch (oper) {
					case "+":
						total = this.addition(baseNum, num2);
						System.out.println(totalText + total);
						baseNum = total;
						break;
					case "-":
						total = this.subtraction(baseNum, num2);
						System.out.println(totalText + total);
						baseNum = total;
						break;
					case "*":
						total = this.muliplication(baseNum, num2);
						System.out.println(totalText + total);
						baseNum = total;
						break;
					case "/":
						total = this.division(baseNum, num2);
						System.out.println(totalText + total);
						baseNum = total;
						break;
					default:
					    System.err.println("Invalid Operation");
				}
				
			}
		}
}
