//Write a java program to find 2nd maximum element of an array.

package Arrayprogram;

public class Secondmax {
    public static void main(String[] args) {
        int[] a = { 2, 1, 0, 3, 5, 9, 10, 2, 5, 13, 11 };
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MAX_VALUE;
        for (int temp : a) {
            if (temp > max) {
                secMax = max;
                max = temp;
            } else if (temp > secMax && temp != max) {
                secMax = temp;
            }
        }
        System.out.println(secMax);
    }
}
