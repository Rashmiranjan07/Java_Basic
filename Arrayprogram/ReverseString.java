//Write a java program to find the reverse of a string 

package Arrayprogram;

public class ReverseString {
    public static void main(String[] args) {
        String res = reverse("Ronaldo");
        System.out.println(res);
    }

    public static String reverse(String s) {
        char ch[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        return new String(ch);
    }

}
