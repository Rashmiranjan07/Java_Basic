//Write a java program to create an array of 10 random numbers less than 200 , while among them which one is the prime & which one is not prime ? 

package Arrayprogram;

import java.util.Arrays;
import java.util.Random;

public class RandomPrime {
	public static void main(String[] args) {
		int[] a = new int[10];
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(200);
		}
		System.out.println(Arrays.toString(a));
		for (int temp : a) {
			if (isprime(temp)) {
				System.out.println(temp + "is Prime");
			} else {
				System.out.println(temp + "is not prime");
			}

		}
	}

	static boolean isprime(int n) {
		if (n <= 1)
			return false;
		int count = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				count++;
		return count == 2;

	}
}
