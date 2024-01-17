package project;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 6, 9, 3, 1, 9 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j])) {
					System.out.println("Duplicate Array is:"+a[j]);
				}
			}

		}
		
		}
	}

