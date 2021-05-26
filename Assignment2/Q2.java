//Program that checks whether a string is a valid password.
//Password must satisfy the following criteria:
//	A password must have at least two characters
//	A password consists of only letters and digits
//	A password must contain at least three digits


package Assignment2;

import java.util.Scanner;


public class Q2 {
//	The minimum number of characters allowed 
    public static int minimumLength = 2;

    public static void main(String[] args) {
//    	Printing the criteria and prompting to enter a password
        Scanner input = new Scanner(System.in);
        System.out.print(
        		"The criteria for a valid password are as follows: \n"+
                "\nA password must have at least two characters.\n" +
                "A password consists of only letters and digits.\n" +
                "A password must contain at least three digits. \n" +
                "\nEnter a password that meets the above requirements: ");
        String password = input.nextLine();
        input.close();
//      Calling passwordLength method to check criteria is valid or invalid
        if (passwordLength(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean passwordLength(String password) {
//    	Checking length
        if (password.length() < minimumLength) return false;
//      Initiating counters for characters and numbers
        int charCount = 0;
        int numCount = 0;
//      For loop that will send each character to letterCheck or numberCheck method and increment the variable
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (numberCheck(ch)) numCount++;
            else if (letterCheck(ch)) charCount++;
            else return false;
        }

//      Ensuring character and number criteria have been hit
        return (charCount >= 2 && numCount >= 3);
    }
//  Method to check letters
    public static boolean letterCheck(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

//  Method to check numbers
    public static boolean numberCheck(char ch) {

        return (ch >= '0' && ch <= '9');
    }


}