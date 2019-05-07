package se.lexicon.jonas.Calculatormaven;

import java.util.Scanner;


public class App {
	
	static Scanner input = new Scanner(System.in);
	
    public static void main( String[] args ){
		double num1;
		double num2;
		String operation;
		boolean question = true;

		
		
		while (question) {
		    System.out.println("please enter the first number");
		    num1 = getValidDouble();
	
		 	System.out.println("please enter the second number");
		 	num2 = getValidDouble();
		 
	
		 	System.out.println("Please enter operation");
		 	operation = input.nextLine();
		 	
    		if (operation.equals("+")) {
    	 		System.out.println("Your answer is: " + (calculationPlus(num1, num2)));			
    	 	} else if  (operation.equals("-")){
    	 		System.out.println("Your answer is: " + (calculationSubtract(num1, num2)));
       	 	} else if (operation.equals("/")) {
    	 		System.out.println("Your answer is: " + (calculationDivision(num1, num2)));
    	 	} else if (operation.equals("*")) {
    	 		System.out.println("Your answer is: " + (calculationMultiplication(num1, num2)));
    	 	
		
		System.out.println("Calculate more? (y/n)");
		String answer = input.nextLine();
		if (answer.equals("y")) {
			System.out.println("Restarting");
		} else {
			System.out.println("Thank you, exiting");
			question = false;
			input.close();	
			}
    	 }
	}
}    	
    	public static double calculationPlus(double num1, double num2) {
    		double calculation = num1 + num2;
    		return calculation;
    	}
    	public static double calculationSubtract(double num1, double num2) {
    		double calculation = num1 - num2;
    		return calculation;
    	}
    	public static double calculationDivision(double num1, double num2) {
    		double calculation = num1 / num2;
    		return calculation;
    	}
    	public static double calculationMultiplication(double num1, double num2) {
    		double calculation = num1 * num2;
    		return calculation;
    	}
    	public static double getValidDouble() {
    		
        	boolean valid = false;
        	double number = 0;
        	
        	while(!valid) {
        		try {
        			String input = App.input.nextLine();
            		number = Double.parseDouble(input);
            		valid = true;
        		}catch (NumberFormatException e) {
    				System.err.println("Input is not a valid double");
    			}    		
        	}    	
        	return number;    	
    	}
}