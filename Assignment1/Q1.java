//This program prompts the user to enter a speed, acceleration and weather conditions to determine the minimum runway length needed for take-off
//
//Prompts the user to input a speed and stores it as variable speed
//Prompts the user to input acceleration and stores it as variable acceleration
//Prompts the user to enter the weather conditions
//If conditions are dry, normal length formula is used
//Else if conditions are wet, the length formula plus 15% is used
//Else there is error checking to account for an incorrect input for weather conditions




package Assignment1;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("Enter a speed for the airplane:");
			double speed = input.nextDouble();
			System.out.println("Enter the acceleration for the airplane:");
			double acceleration = input.nextDouble();
			System.out.println("Is the runway wet or dry? Enter 'w' for wet and 'd' for dry.");
			char ch = input.next().charAt(0);
//			Allows upper and lower case characters to be used
			char sh = Character.toLowerCase(ch);
			input.close();
			if (sh == 'd')
			{
				double length = (Math.pow(speed, 2) / (2 * acceleration)); 
				System.out.println("The minimum runway length needed for take-off is:");
				System.out.println(length);
			} else if (sh == 'w'){
				double length = (Math.pow(speed, 2) / (2 * acceleration)) * 1.15; 
				System.out.println("The minimum runway length needed for take-off is:");
				System.out.println(length);
			} else {
				System.out.println("Please enter a valid input for the weather condition.");
			}
	}
}
