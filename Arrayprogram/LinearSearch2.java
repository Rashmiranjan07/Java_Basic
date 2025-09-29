// Write a java program to do linear search in a string in a reverse  manner , if the character is present return the index , otherwise return -1.

package Arrayprogram;

public class LinearSearch2 {
    public static void main(String[] args) {
        String s = "java is easy";
        char ch = 'a';
        int index = lastIndexOf(s, ch);
        System.out.println(index);
    }

    static int lastIndexOf(String s, char ch) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ch) {
                return i;
            }
        }

        return -1;

    }

}
