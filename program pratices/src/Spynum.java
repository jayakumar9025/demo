import java.util.Scanner;

public class Spynum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers");
	int num=sc.nextInt();
	int temp=num;
	int temp1=num;
	int last=0;
	int sum=0;
	int p_sum=1;
	
	while(num!=0) {
		last=last%10;
		sum=sum+last;
		num=num/10;
		
	}
	while(temp1!=0) {
		last=last%10;
		p_sum=p_sum*last;
		temp1=temp1/10;
		
	}
	if(sum==p_sum) {
		System.out.println(temp+" : is spy number");
	}
	else {
		System.out.println(temp+" : is not spy number");
	}
		
}
}
