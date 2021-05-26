//Program that prompts the user to enter an investment amount and an annual percentage
//interest rate, and prints a table that displays future value for the years from 1 to 30


package Assignment2;

import java.util.Scanner;

public class Q1 {
//	Main Method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//			Prompts the user to enter an investment amount
			System.out.println("Enter an investment amount: ");
			double invest = input.nextDouble();
//			Prompts the user to enter an annual percentage interest rate
			System.out.println("Enter an annual percentage interest rate: ");
			double apr = input.nextDouble();
//			Error Checking. Ensuring the investment amount and apr are positive.
			if (invest < 0 || apr < 0) {
				System.out.println("Error. Please enter a positive amount.");
			} else {
				
				
			int totalYears = 30;
//			Getting the monthly interest rate
			double monthlyRate = apr / 1200;
//			Closing the scanner
			input.close();
			
//			Printing the amount invested, then the interest rate, then the table that displays the future value from 1 to 30
			System.out.println("\nThe amount invested: " + invest);
			System.out.println("Annual interest rate: " + apr);
			System.out.println("\nYears          Value"); // Table header
			for (int year = 1; year <= totalYears; year++) {
				System.out.printf("%-10d", year);
				System.out.printf("%11.2f\n", futureValue(invest, monthlyRate, year));
			}
			}
	}
//			Method that calculates the future investment value
			public static double futureValue(double amount, double monthlyRate, int years){
					return amount * Math.pow(1 + monthlyRate, years * 12);
			}
}


