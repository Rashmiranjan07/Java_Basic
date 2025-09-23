
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

// WAP to find sum of all element from an array or by using variable -argument
// method .
class Test01 {
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

// we can use array also in the argument part
class Test02 {
    public static void main(String[] args) {
        int a[] = { 20, 40, 60 };

        int res = m1(a);
        System.out.println(res);

    }

    static int m1(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

// Using for each loop WAP to sum of all elemnts :-
class Test03 {
    public static void main(String[] args) {
        int res = m1(10, 20, 30);
        System.out.println(res);
    }

    static int m1(int... a) {
        int sum = 0;
        for (int temp : a) {
            sum = sum + temp;
        }
        return sum;
    }

}

// write a java program to find sum of all even no and multiplocaation of all
// odd numbers in a array.
class Test04 {
    public static void main(String[] args) {
        m1(1, 2, 3, 4, 5, 6, 7, 8, 9);

    }

    static void m1(int... a) {
        int sum = 0;
        int multi = 1;
        for (int temp : a) {
            if (temp % 2 == 0) {
                sum = sum + temp;
            } else {
                multi *= temp;
            }

        }
        System.out.println("sum=" + sum + "    multi=" + multi);
    }

}

// In Java, Arrays.toString() is a utility method from the java.util.Arrays
// class that converts an array into a human-readable string.

/*
 * import java.util.Arrays;
 * 
 * class Test05 {
 * public static void main(String[] args) {
 * int a[]= {10,20,30,40,50};
 * System.out.println(a);
 * 
 * String res=Arrays.toString(a);
 * System.out.println(res);
 * }
 * 
 * }
 */

// Write a java program to updated an element at given index
// int a[]-> [2,4,6,1,9,0]
/*
 * import java.util.Arrays;
 * class Test06 {
 * public static void main(String[] args) {
 * int a[]= {2,4,6,1,9,0};
 * System.out.println(Arrays.toString(a));
 * 
 * m1(a,3,50);
 * System.out.println(Arrays.toString(a));
 * }
 * static void m1(int a[],int index,int newElemenet) {
 * a[index]=newElemenet;
 * }
 * 
 * }
 */