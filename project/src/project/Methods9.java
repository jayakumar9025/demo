package project;



//import java.util.Scanner;
public class Methods9 {
	// Java Program to print pattern 
	// Square hollow pattern 
	

	
		// Function to demonstrate pattern 
	

	
	    public static void main(String[] args) {
	       // Scanner scanner = new Scanner(System.in);

	        //System.out.print("Enter the side length of the square: ");
	        int n = 6;
	        

	        for (int i =0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                // Print asterisk only for the outer boundary
	                if (i==j||i+j==n-1||i==0||i==n-1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print(" "); // Print spaces for the inner part
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }

	        
	        
	    }
	}

	



