import java.util.Scanner;

public class Day1_1 {
   public static void main(String[] args) {
	   int osum=0;
	   int esum=0;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the numbers...");
		int num=sc.nextInt();
		while(num!=0) {
			int last=num%10;
			if(last%2==0) {
				 esum=esum+last;
			}
			else {
				 osum=osum+last;
			}
			num=num/10;
			
		}
	}
	
   }
}

