import java.util.Scanner;

public class Ducknum {//the given num is stating with 0 mean not D_n,but we can use 0 as middle and end is calll as duck number
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	boolean res = duckcheck(num);
	
	if(res) {
		System.out.println("Given nuber is Duck Number");
	}
	else
		System.out.println("Given nuber not is Duck Number");
}
public static boolean duckcheck(int a) {
	while(a!=0) {
	if(a%10==0) {
		return true;
		
	}
	a=a/10;
 }
	return false;
	
	
}
}
