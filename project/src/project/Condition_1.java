package project;

import java.util.Scanner;

public class Condition_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the A number");
		int a=sc.nextInt();
		System.out.println("Enter the B number");
		int b=sc.nextInt();
		System.out.println("Enter the C number");
		int c=sc.nextInt();
		
		int res=(a<=b && a<=c)? a:(b<=c)?b:c;
		System.out.println(res+": is Smaller");
		
	}

}
