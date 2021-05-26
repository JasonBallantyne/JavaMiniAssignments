//Program that will count the number of characters, words and lines in a file

//Words are separated by whitespace characters and are included as characters
//The file name should be passed as a command-line argument


package Assignment4;


import java.io.*;
import java.util.*;

public class Q1 {
	public static void main(String[] args) throws Exception {

		// Checking if the file exists
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}
		// Variable for the number of characters
		int characters = 0;
		// Variable for the number of words
		int words = 0;			
		// Variable for the number of lines
		int lines = 0;			

		try (
			// Creating an input file
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				lines++;
				String line = input.nextLine();
				characters += line.length();
			}
		}

		try (
				// Creating an input file
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				String line = input.next();
				words++;
			}
		}

		// Printing the results
		System.out.println("java Q1 " + file.getName());
		System.out.println("File " + file.getName() + " has:");
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}
}

