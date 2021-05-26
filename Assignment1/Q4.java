//Program that prompts the user to enter two strings and displays the largest common prefix of the two strings
//
//Prompts the user to enter the two strings and stores them as variables
//Identifies the longest and shortest strings and names them as 'big' and 'little' respectively
//toCharArray converts the string into characters so you can loop through each character in the string
//Inside the loop you should exit on two conditions - End of the string or no more matching characters
//Increment the index
//The variable index will store the largest common prefix
//Error checking - if index = 0, print there is no common prefix

package Assignment1;

import java.util.Scanner;

public class Q4 {
	public static void main (String[] args)
    {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = input.nextLine();
		System.out.println("Enter another string:");
		String s2 = input.nextLine();
		input.close();
        String little,big;
         if(s.length() > s2.length()) 
            {little = s2;big = s;}
          else
            {little = s;big = s2;}
        int index = 0;    
        for(char c: big.toCharArray())
        {
            if(index==little.length()) break;
            if(c != little.charAt(index)) break;
            index++;
        }
        if(index==0) {
          System.out.println("There is no common prefix");
        } else {
	    	System.out.println("The common prefixes are: ");
	        System.out.println(big.substring(0,index));
        }
    }
}


