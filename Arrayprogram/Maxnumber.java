// Write a java program to find maximum no of element in an array .

package Arrayprogram;

public class Maxnumber {
    public static void main(String[] args) {
        int a[] = { 2, 3, 9, 5, 6, 10, 4 };
        int max = Integer.MIN_VALUE;
        for (int temp : a) {
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
    }

}
