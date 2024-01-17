package project;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,60,70,80};
		int index =4;
		int value=50;
		
		for(int i=array.length-1 ; i>4 ; i--) {
			array[i]=array[i-1];
			
		}
		array[index]=value;
		System.out.println(Arrays.toString(array));
	}

}
