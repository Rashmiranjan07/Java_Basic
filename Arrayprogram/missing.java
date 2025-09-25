// Write a java program to find the missing element of an array ?

package Arrayprogram;

import java.util.Arrays;

public class missing {
	public static void main(String[] args) {
		int a[] = { 1, 5, 3, 7, 4, 6, 10, 9 };
		missing1(a);
	}

	static void missing1(int a[]) {
		Arrays.sort(a);
		for (int i = 1; i < a.length; i++) {
			if (a[i] - 1 != a[i - 1]) {
				System.out.println(a[i] - 1);
			}
		}
	}

}
