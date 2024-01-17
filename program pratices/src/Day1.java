import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size the array");
		//int n=sc.nextInt();
		
		int []a=new int [sc.nextInt()];
		System.out.println("Enter the values for array");
		for(int i=0 ; i<a.length ; i++) {
			a[i]=sc.nextInt();
			
		}
		int count=0;
		
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]<=0) {
				count++;
				
			}
			
			
		}
		System.out.println("the negative count is: "+count);
	}

}
