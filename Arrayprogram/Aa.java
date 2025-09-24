package Arrayprogram;

class Anonymousarr {
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