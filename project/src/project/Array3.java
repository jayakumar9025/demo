
package project;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int a[] = { 2, 6, 3, 9, 5, 1 };
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println(Arrays.toString(a));

	}

}
