// Write a java program to do linear search in a string , if the character is present return the index , otherwise return -1.

package Arrayprogram;

public class LinearSearch1 {
    public static void main(String[] args) {
        String s = "java is easy";
        char ch = 'i';
        int index = indexOf(s, ch);
        System.out.println(index);
    }

    static int indexOf(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                return i;
            }
        }

        return -1;

    }

}
