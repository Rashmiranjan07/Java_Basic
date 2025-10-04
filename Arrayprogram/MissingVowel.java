// Writw a java program to found the missing vowel inside a given sentense and assume that the sentense is in lower case .

package Arrayprogram;

public class MissingVowel {
    public static void main(String[] args) {
        String s = " java is easy";
        String temp = "aeiou";
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if (s.indexOf(ch) == -1) {
                System.out.println(ch);
            }
        }
    }

}
