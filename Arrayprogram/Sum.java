package Arrayprogram;

public class Sum {
	 public static void main(String[] args) {
	        int a[] = { 20, 40, 60 };

	        int res = m1(a);
	        System.out.println(res);

	    }

	    static int m1(int... a) {
	        int sum = 0;
	        for (int i = 0; i < a.length; i++) {
	            sum += a[i];
	        }
	        return sum;
	    }

}