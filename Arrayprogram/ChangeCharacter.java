// Write a java program to change the character inside a String 


package Arrayprogram;

public class ChangeCharacter {
    public static void main(String[] args) {
        String res = changeChar("This is java class", 'a', '*');
        System.out.println(res);
    }

    public static String changeChar(String s, char oldChar, char newChar) {
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == oldChar) {
                ch[i] = newChar;
            }
        }
        String res = new String(ch);
        return res;
    }

}
