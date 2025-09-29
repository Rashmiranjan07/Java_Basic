// Write a java program to delete an element at the first index of an array .

package Arrayprogram;

import java.util.Arrays;

public class DeleteFirst {
    public static void main(String[] args) {
        int[] a = { 2, 3, 9, 5, 6, 1 };
        int[] b = new int[a.length - 1];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i + 1];
        }
        a = b;
        System.out.println(Arrays.toString(a));
    }

}
