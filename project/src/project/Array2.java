package project;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int e=0;
		int o=0;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		int a[]=new int[sc.nextInt()];
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.println("Enter the value for a["+i+"]");
			a[i]=sc.nextInt();
			
		}
		for(int element : a) {
			if(element%2==0) {
				e++;
			}
			else
				o++;
		}
		System.out.println("The event count is :"+e);
		System.out.println("The odd count is : "+o);
		
	}

}
