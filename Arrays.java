
// Anynymous object:-
import java.util.Scanner;

class Arrays {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        sum(arr);
        sum(new int[] { 10, 20, 30 });
    }

    public static void sum(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        System.out.println(sum);
    }
}

// WAP to print the array elemnts which is taken by user and array size also
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an arary");
        int size = sc.nextInt();
        int[] x = new int[size];
        System.out.println("enter the elements");
        for (int i = 0; i < size; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Print the elements");
        for (int i = 0; i < size; i++) {
            System.out.println(x[i]);
        }

    }
}

// WAP to find sum of all element from an array or by using variable -argument method .
class Test01 {
	public static void main(String[] args) {
		int a[]= {20,40,60};
		
		int res=m1(a);
		System.out.println(res);
		//System.out.println(m1(a));
		
	}
	
	static int m1(int...a) {
		int sum=0;
		for(int i=0; i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
}