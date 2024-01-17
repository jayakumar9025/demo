package project;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		char vowels[]=new char[sc.nextInt()];
		boolean if_vowels=false;
		for(int i=0 ; i<vowels.length ; i++) {
			System.out.println("Enter the Characters vowels+["+i+"]+");
			vowels[i]=sc.next().charAt(0);
			
		}
		for(int i=0 ; i<vowels.length ; i++) {
		if(vowels[i]=='A'||vowels[i]=='E'||vowels[i]=='I'||vowels[i]=='U'||vowels[i]=='O'||vowels[i]=='a'||vowels[i]=='e'||vowels[i]=='i'||vowels[i]=='o'||vowels[i]=='u') {
		if_vowels=true;
		System.out.println("vowels : "+vowels[i]);
		}
		}
		if(if_vowels) {
			
		}
		else
			System.out.println("Their is no vowels");

	}

}
