package project;

public class methods3 {
	public static void main(String[] args) {
		int num=82345;
		int last=num%10;
		while(num>9) {
			num/=10;
			
		}
		System.out.println("the sum of first & last digit is : "+(num+last));
	}

}
