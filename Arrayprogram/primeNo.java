// Write a java program to print all the prime number of an array?

package Arrayprogram;

public class primeNo {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int temp : a) {
			if (isPrime(temp)) {
				System.out.println(temp);
			}
		}
	}

	static boolean isPrime(int n) {
		if (n <= 1)

			return false;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		return count == 2;
	}

}
