import java.util.Scanner;

public class Swap_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int u=sc.nextInt();
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		
		int temp=0;
		temp=a[u-1];
		a[u-1]=a[a.length-u];
		a[a.length-u]=temp;
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(a[i]+"  ");
		}
		
		
			
	}

}
