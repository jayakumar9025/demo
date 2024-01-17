package project;
import java.util.*;
public class Methods6 {
	static Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for (int i=1 ; i<=num ; i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if (count==2) {
			System.out.println(num+": is prime number");
			
		}
		else
			System.out.println(num+": is not prime number");

	}

}
