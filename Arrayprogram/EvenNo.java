// Write a java program to print only the even number of an array?

package Arrayprogram;

public class EvenNo {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int temp : a) {
			if (temp % 2 == 0) {
				System.out.println(temp);
			}
		}

	}
}
