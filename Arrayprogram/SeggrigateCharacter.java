package Arrayprogram;

public class SeggrigateCharacter {
	public static void main(String[] args) {
		String s="This is @s Java 426full* staCk$1";
		String uc="";
		String lc="";
		String dc="";
		String sc="";
		for (int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') uc= uc+ch;
			else if (ch>='a' && ch<='z') lc+=ch;
			else if (ch>='0' && ch<='9') dc+=ch;
			else sc+=ch;
			
		}
		System.out.println(uc+"\n"+lc+"\n"+dc+"\n"+sc);
		
	}

}
