package project.hcl.bugs;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {
	//May not need arrlist
//		private static ArrayList<Integer> arrlist = new ArrayList<Integer>();
		private static ArrayList<Integer> expenses = new ArrayList<Integer>();
		
	    Scanner sc = new Scanner(System.in);

		public void addSampleExpenses() {
			expenses.add(1000);
	        expenses.add(32000);
	        expenses.add(2300);
	        expenses.add(45000);
	        expenses.add(110);
		}
		
		public void optionsSelection() {
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
//	        expenses.addAll(arrlist);
	        System.out.println("\nEnter your choice:\t");
	        int  options = 0;
	        try {
	        	options =  sc.nextInt();
	        }catch (InputMismatchException e) {
	        	System.err.println("Improper format, please try again");
	        	return;
	        }
	        
	        switch (options){
	            case 1:
	                System.out.println("Your saved expenses are listed below: \n");
	                System.out.println(expenses+"\n");
	                //Do not need recursion 
	                break;
	            case 2:
	                System.out.println("Enter the value to add your Expense: \n");
	                
	                int value = 0;
	                try {
	                	value = sc.nextInt();
	    	        }catch (InputMismatchException e) {
	    	        	System.err.println("Improper format, please try again");
	    	        	return;
	    	        }
	                
	                expenses.add(value);
	                System.out.println("Your value is updated\n");
//	                expenses.addAll(arrlist);
	                System.out.println(expenses+"\n");
	                break;
	            case 3:
	                System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                int con_choice = sc.nextInt();
	                
	                try {
	                	con_choice = sc.nextInt();
	    	        }catch (InputMismatchException e) {
	    	        	System.err.println("Improper format, please try again");
	    	        	return;
	    	        }
	                
	                if(con_choice==options){
	                       expenses.clear();
	                       System.out.println(expenses+"\n");
	                       System.out.println("All your expenses are erased!\n");
	                } else {
	                    System.out.println("Oops... try again!");
	                }
	                return;
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
	    	        	return;
	    	        }
	                
	                searchExpenses(expenses, search);
	                break;
	            case 6:
	            	sc.close();
	                closeApp();
	                break;
	            default:
	            	sc.close();
	                System.out.println("You have made an invalid choice!");
	                break;
	        }
	    }

		private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	    }
		
	    public void searchExpenses(ArrayList<Integer> arrayList, int searchExpense) {
	        int leng = arrayList.size();        
	        //Linear search
	        //Complete the method
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
	        
	        //binary search
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
	       //Complete the method. The expenses should be sorted in ascending order.
//	        MergeSort objMergeSort = new MergeSort();
//	        objMergeSort.sort(arrayList,0,arrayList.get(arrLength - 1) );
	        
	        QuickSort quickObj = new QuickSort();
	        quickObj.sort(arrayList, 0, arrLength - 1);
	        System.out.println("QuickSort " + arrayList.toString());
	    }
	    
	    static void printArray(int arr[])
		{
		    int n = arr.length;
		    for (int i=0; i<n; ++i)
		        System.out.print(arr[i] + " ");
		    System.out.println();
		}
}
