
public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start =1;
		int end= 10;
		int sum=0;
		
		//boolean res=false;
		
		for (int i = start ; i<=end ; i++) {
			if (i==0 || i==1) {
				System.out.println(i+" : Neigther prime Number not composite");
				
			}
			else {
				if (isprime(i)) {
					System.out.println(i);
					sum+=i;
				}
			}
			
		}
		System.out.println(sum+": is total sum");
		

	}
	public static boolean isprime(int num) {
		boolean res=true;
		for (int i=2 ;i<num ; i++) {
			if(num%i==0) {
				res=false;
				break;
			}
		}
		return res;
		
	}

}
