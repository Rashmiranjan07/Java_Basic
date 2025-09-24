package Arrayprogram;

public class Sum_Multi {

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

