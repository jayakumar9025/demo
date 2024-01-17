package project;
import java.util.*;
public class Methods8 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int num=sc.nextInt();
			int temp=num;
			
			int digit3,digit2,digit1;
			digit3=num%10;
			num=num/10;
			
			digit2=num%10;
			num=num/10;
			
			digit1=num%10;
			int result=(digit3*digit3*digit3)+(digit2*digit2*digit2)+(digit1*digit1*digit1);
			if(temp==result) {
				System.out.println(temp+" : is Armstrong number");
			}
			else
				System.out.println(temp+" : is not Armstrong number");
		}
			}

}
