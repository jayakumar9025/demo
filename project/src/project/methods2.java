package project;

import java.util.Scanner;

public class methods2 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1 ; i<num ; i++) {
			if(num%i==0) {
				System.out.println("the factors is :"+i);
				
			}
			
		}
		
		
		
	}

}
