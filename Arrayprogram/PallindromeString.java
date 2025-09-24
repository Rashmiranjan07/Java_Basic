package Arrayprogram;


public class PallindromeString {
	public static void main(String[] args) {
		String input= "madam";
		String input1="malayalam";
		System.out.println(isPallindrome(input));
		System.out.println(isPallindrome(input1));
		
	}
	static boolean isPallindrome(String s) {
		if(s.length()==0) return true;
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse =reverse+s.charAt(i);
		}
		return s.equals(reverse);
	}

}
