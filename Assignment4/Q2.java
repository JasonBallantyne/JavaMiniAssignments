// Program that renames a file

// The program checks whether the file exists
// If it exists it changes the file name by appending the date and time to the file
// Pass the filename from the command line

package Assignment4;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q2 {
   public static void main(String[] args) {
	   
	   // Checking if the file exists
	   
	   File oldName = new File(args[0]);
	   if (!oldName.exists()) {
			System.out.println("The File " + args[0] + " does not exist");
			System.exit(2);
		}
	   
	   // Formatting the time to suit example
	   Date date = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH_mm_ss z yyyy ");
	   String dateFormat = formatter.format(date);
	  
	   // Renaming the file to be the old file name + the current date and time
	   File newName = new File(args[0] + dateFormat);
	      
	   
	   // Informing the user if the renaming was successful
	   if(oldName.renameTo(newName)) {
		   System.out.println("Success. New file is " + args[0] + dateFormat);
	      } else {
	    	  System.out.println("Error renaming the file");
	      }
	   }
}

	   
	  
      

    