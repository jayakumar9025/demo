package project;
import java.util.*;
public class Methods5 {
	static Scanner sc= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for (int i=1 ; i<num ; i++) {
			if(num%i==0) {
				
				sum+=i;
			}
			
			
		}
		if(sum==num) {
			System.out.println(sum+" : is perfect number");
		}
		else
			System.out.println(sum+" : is not perfect number");
		
	}

}
