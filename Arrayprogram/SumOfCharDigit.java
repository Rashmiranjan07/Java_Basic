// Write a java program to find sum of all digit inside a string 

package Arrayprogram;

public class SumOfCharDigit {
	public static void main(String[] args) {
		String s="1su23bhka41ti";
		int sum=0;
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			
			if(ch>='0' && ch<='9' ) {
				sum= sum+ (ch-'0'); //sum=sum+(ch-48);
			}
		}
		System.out.println(sum);
	}

}
