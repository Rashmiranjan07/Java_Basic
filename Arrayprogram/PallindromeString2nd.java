package Arrayprogram;

public class PallindromeString2nd {
	public static void main(String[] args) {
		String input= "never odd or even";
		
		System.out.println(isPallindrome(input));
		
	}

	static boolean isPallindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==' ')i++; //skip the space
			if(s.charAt(j)==' ')j--; //skip the space
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

}
}
