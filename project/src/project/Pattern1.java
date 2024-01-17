package project;
//import java.util.*;
public class Pattern1 {
	// Java Program to print pattern 
	// Number triangle pattern 
	 

	//
		// Function to demonstrate pattern 
	// Java Program to print pattern 
	// Number triangle pattern 
	 

	
		// Function to demonstrate pattern 
		public static void printPattern(int n) 
		{ 
			int i, j; 
			// outer loop to handle number of rows 
			for (i = 1; i <= n; i++) { 
				// inner loop to print space 
				for (j = 1; j <= n - i; j++) { 
					System.out.print(" "); 
				} 
				for (j = 1; j <= i; j++) { 
					System.out.print(i + " "); 
				} 
				// inner loop to print star 
				
				// print new line for each row 
				System.out.println(); 
			} 
		} 

		// Driver Function 
		public static void main(String args[]) 
		{ 
			int n = 6; 
			printPattern(n); 
		} 
	}

	



