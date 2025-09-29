package Arrayprogram;

import java.util.Arrays;

public class InsertFirst {
	public static void main(String[] args) {
		int[] a = { 2, 3, 9, 6, 5, 1 };
		int b[] = new int[a.length + 1];
		b[0] = 20;
		for (int i = 1; i < b.length; i++) {
			b[i] = a[i - 1];
		}
		a = b;
		System.out.println(Arrays.toString(a));

	}

}