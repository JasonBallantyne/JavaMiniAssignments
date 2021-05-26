//Program that randomly generates a random integer between 0 - 100.
//The program prompts the user to enter a number continuously until the number matches the randomly generated number
//
//
//Generates a random number to be guessed by using Math.random
//Prompt the user to guess a number between 0 - 100 and store it is a variable called 'guess'
//For each input, lets the user know if he is too high or too low until the variable guess = the randomly generated number
//Close the scanner outside of the loop 



package Assignment1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		 int number = (int)(Math.random() * 101);
		 Scanner input = new Scanner(System.in);
		 System.out.println("Guess a number between 0 and 100");
		 int guess = -1;
		 while (guess != number) {
		 System.out.print("\nEnter your guess: ");
		 guess = input.nextInt();
		 if (guess == number)
		 System.out.println("Correct!, the number is " + number);
		 else if (guess > number)
		 System.out.println("Your guess is too high");
		 else
		 System.out.println("Your guess is too low");
		 
		 }
		 input.close();
		 }
	
}
