//Program that reads in a string representing a series of results of a sports team as 'W', 'D' or 'L'
//'W' represents a win, 'D' represents a draw and 'L' represents a loss
//3 points are given for a win, 1 point for a draw and 0 points for a loss.
//Prints the total points and the average points of the team.


package Assignment2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//			Prompts user to enter a series of results
			System.out.println("Enter a string representing any number of wins, draws and losses e.g. 'WWDLDL': ");
			String result = input.nextLine();
//			Converts the inputed string to upper case
			String resultUpper = result.toUpperCase();
//			Passes the string to the isValid method
			boolean isValid = CheckValid(resultUpper);
//			Error Checking
			if(!isValid)
			{
				System.out.println("Invalid format, enter again");
				return;
			}	
			int overallScore = CountWord(resultUpper);
			float averageScore = (float)overallScore / (float)result.length();
			input.close();
//			Prints the total points and average points to 2 decimal places
			System.out.println("Total points: " + overallScore);
			System.out.print("Average points: ");
			System.out.printf("%.2f", averageScore);
	}
//	Method to check the validity of the inputed string
	public static boolean CheckValid(String value)
	{
		for(char curVal : value.toCharArray())
		{
			if(curVal != 'W' && curVal != 'D' && curVal != 'L')
				return false;
			
		}
		return true;
	}
//	Method to count the score
	public static int CountWord(String curString)
	{
		int overallScore = 0;
		for(char curVal : curString.toCharArray())
		{
			if(curVal == 'W')
				overallScore += 3;
			else if(curVal == 'D')
				overallScore += 1;
			else
				overallScore += 0;
		}
		
		return overallScore;
	}
}