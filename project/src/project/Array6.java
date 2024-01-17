package project;

import java.util.Arrays;

public class Array6 {
//reverse the array 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {30,40,10,20,};
		int b[]=new int[a.length];
		 for (int i = a.length - 1 ,j=0 ; i>=0 ; i--,j++) {
	            b[j] = a[i];
	        }
		 System.out.println(Arrays.toString(b));
		}
		

	}


