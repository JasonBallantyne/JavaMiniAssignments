//Program that prompts the user to enter the year and month as integers and displays the number of days in the month.abstract
//
//Prompt the user to enter the month as an integer
//Prompt the user to enter the year as an integer
//Switch expression to determine which month to enter to print number of days in that month
//For a February, a separate boolean expression is called to determine if it is a leap year or not



package Assignment1;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Please enter the month as an integer: ");
		int month = input.nextInt();
		System.out.print("Please enter the year as an integer: ");
		int year = input.nextInt();
//		Formula to determine if it is a leap year
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		input.close();
		switch (month)
		{
			case 1: System.out.println(
					 "January " + year + " had 31 days"); break;
			case 2: System.out.println("February " + year + " had" +
					  ((leapYear) ? " 29 days" : " 28 days")); break;
			case 3: System.out.println(
					 "March " + year + " had 31 days"); break;
			case 4: System.out.println(
					 "April " + year + " had 30 days"); break;
			case 5: System.out.println(
					 "May " + year + " had 31 days"); break;
			case 6: System.out.println(
					 "June " + year + " had 30 days"); break;
			case 7: System.out.println(
					 "July " + year + " had 31 days"); break;
			case 8: System.out.println(
					 "August " + year + " had 31 days"); break;
			case 9: System.out.println(
					 "September " + year + " had 30 days"); break;
			case 10: System.out.println(
					 "October " + year + " had 31 days"); break;
			case 11: System.out.println(
					 "November " + year + " had 30 days"); break;
			case 12: System.out.println(
					 "December " + year + " had 31 days");
		}
	}
	
}

