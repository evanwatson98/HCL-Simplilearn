package project.hcl.bugs;

public class Main {

    public static void main(String[] args) {
    	Display display = new Display();
        /*System.out.println("Hello World!");*/
    	display.addSampleExpenses();
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        boolean isRunning = true;
        while(isRunning) {
        	isRunning = display.optionsSelection();
        }
    }
    
    //TO-DO Remove recusrion
   
}
