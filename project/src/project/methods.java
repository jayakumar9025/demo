package project;

import java.util.Scanner;

public class methods {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		  System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp =num;
		int	rev=0;
		
		while(num!=0) {
			rev=(rev*10)+(num%10);
			num/=10;
			
			
			
		}
		String res =(rev==temp)? "palindrome":"not palindrome";
		System.out.println("the given :"+""+temp+""+" is "+res);
		
		
		
		
	}

}
