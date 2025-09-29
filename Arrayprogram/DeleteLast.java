//Write a java program to delete an element at the last index of an aray 

package Arrayprogram;

import java.util.Arrays;

public class DeleteLast {
    public static void main(String[] args) {
        int a[] = { 2, 3, 9, 5, 6, 1 };
        int b[] = new int[a.length - 1];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        a = b;
        System.out.println(Arrays.toString(a));

    }

}
