package project;
import java.util.*;
public class Methods7 {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter the number");
			int num=sc.nextInt();
			int temp=num,last,fact,sum=0;
			  
			
			while(num>0) {
				fact =1;
				
				last=num%10;
				for (int i=1 ; i<=last ; i++) {
					fact*=i;
					
					
				}
				sum+=fact;
				num=num/10;
				
			}
			if(sum==temp) {
				System.out.println(temp+" : is strong number");
			}
			else
				System.out.println(temp+" : is not Strong number");
		}
		
	}

}
