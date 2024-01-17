import java.util.Scanner;

public class Square_root_of_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSc
		System.out.println("Enter the number");
		Scanner sc= new Scanner (System.in);
		int num =sc.nextInt();
		int a=1;
		int b=1;
		
		
		
		while(b<=num) {
			a++;
			b=a*a;
			
			
		}
		System.out.println(a-1+": is Square root of given number");
		
		
		

	}

}
