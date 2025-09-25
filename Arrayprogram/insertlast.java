// write a java program to insert an element at last af an array ?

package Arrayprogram;

import java.util.Arrays;

public class insertlast {
	public static void main(String[] args) {
		int[] a = { 9, 2, 6, 0, 4, 2, 6 };
		int[] b = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[a.length] = 1;
		a = b;
		System.out.println(Arrays.toString(a));
	}

}
