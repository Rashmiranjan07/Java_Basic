// write a java program to sort the element of an array .(Bubble sort)



package Arrayprogram;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = { 2, 1, 5, 9, 4, 10, 8, 7 };

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
