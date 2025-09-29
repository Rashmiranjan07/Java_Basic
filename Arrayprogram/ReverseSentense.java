//Write a java program to reverse ,'n' sentense ..


package Arrayprogram;

public class ReverseSentense {
	public static void main(String[] args) {
		String op=reverseSentence("java is easy");
		System.out.println(op);
		
		
	}
	
	public static String reverseSentence(String S) {
		String[] sa=S.split(" ");
		String res="";
		for(int i=sa.length-1;i>=0; i--) {
			res=res+sa[i];
			if(i==0) continue;
			res=res+" ";
		}
		return res;
	}

}
