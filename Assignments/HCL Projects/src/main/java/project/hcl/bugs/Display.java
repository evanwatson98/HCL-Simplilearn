package project.hcl.bugs;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {

		private static ArrayList<Integer> expenses = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		int  options = 0;
		public void addSampleExpenses() {
			expenses.add(1000);
	        expenses.add(32000);
	        expenses.add(2300);
	        expenses.add(45000);
	        expenses.add(110);
		}
		
		public boolean optionsSelection() {
	        String[] arr = {"1. I wish to review my expenditure",
	                "2. I wish to add my expenditure",
	                "3. I wish to delete my expenditure",
	                "4. I wish to sort the expenditures",
	                "5. I wish to search for a particular expenditure",
	                "6. Close the application"
	        };
	        int  slen = arr.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	            // display the all the Strings mentioned in the String array
	        }

	        System.out.println("\nEnter your choice:\t");
	        int  options = 0;	        
	        try {
	        	options =  sc.nextInt();
	        }catch (InputMismatchException e) {
	        	System.err.println("Wrong: Improper format, please try again");
	        	sc.next();
	        	return true;
	        }
	        switch (options){
	            case 1:
	                System.out.println("Your saved expenses are listed below: \n");
	                System.out.println(expenses+"\n");
	                break;
	            case 2:
	                System.out.println("Enter the value to add your Expense: \n");
	                
	                int value = 0;
	                try {
	                	value = sc.nextInt();
	    	        }catch (InputMismatchException e) {
	    	        	System.err.println("Improper format, please try again");
	    	        	sc.next();
	    	        	return true;
	    	        }
	                
	                expenses.add(value);
	                System.out.println("Your value is updated\n");
	                System.out.println(expenses+"\n");
	                break;
	            case 3:
	                System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                int con_choice = sc.nextInt();
	                
	                try {
	                	con_choice = sc.nextInt();
	    	        }catch (InputMismatchException e) {
	    	        	System.err.println("Improper format, please try again");
	    	        	sc.next();
	    	        	break;
	    	        }
	                
	                if(con_choice==options){
	                       expenses.clear();
	                       System.out.println(expenses+"\n");
	                       System.out.println("All your expenses are erased!\n");
	                } else {
	                    System.out.println("Oops... try again!");
	                }
	                break;
	            case 4:
	                sortExpenses(expenses);
	                break;
	            case 5:
	                System.out.println("Enter the expense you need to search:\t");
	                
	                int search = 0;
	                try {
	                	search = sc.nextInt();
	    	        }catch (InputMismatchException e) {
	    	        	System.err.println("Improper format, please try again");
	    	        	sc.next();
	    	        	break;
	    	        }
	                
	                searchExpenses(expenses, search);
	                break;
	            case 6:
	            	sc.close();
	                closeApp();
	                return false;
	            default:
	                System.err.println("You have made an invalid choice!");
	                break;
	        }
	        return true;
	    }

		private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	    }
		
	    public void searchExpenses(ArrayList<Integer> arrayList, int searchExpense) {
	        int leng = arrayList.size();        
	        
	        //Linear search
	        int i = 0;
	        while(i < leng) {
	        	int expense = expenses.get(i);
	        	if(expense == searchExpense) {
	        		System.out.println("Found Expense at index: " + i);
	        		return;
	        	}
	        	i++;
	        }
	        System.out.println("Did not find expense");
	        
	        //binary search, would need a sorted list to work
//	        int i = 0;
//	        while(i < leng && i > 0) {
//	        	int expense = expenses.get(i);
//	        	if(expense == searchExpense) {
//	        		System.out.println("Found Expense at index: " + i);
//	        		return;
//	        	}
//	        	if(expense < searchExpense) {
//	        		i += ((leng - i) / 2);
//	        	}
//	        	else {
//	        		i -= (i/2);
//	        	}
//	        }
//	        System.out.println("Did not find expense");
	    }
	    
	    
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	        int arrLength =  arrayList.size();
	        
	        QuickSort quickObj = new QuickSort();
	        quickObj.sort(arrayList, 0, arrLength - 1);
	        System.out.println("QuickSort " + arrayList.toString());
	    }

}
