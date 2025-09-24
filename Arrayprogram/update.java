package Arrayprogram;

import java.util.Arrays;

public class update {
	public static void main(String[] args) {
		int a[]= {3,2,1,4,3,5,4};
		System.out.println(Arrays.toString(a));
		 update1(a,10,3);
		 
		 System.out.println(Arrays.toString(a));
	}
	
	static void update1(int a[],int newValue, int oldValue) {
		for(int i=0; i<a.length;i++) {
			if (a[i]==oldValue) {
				a[i]=newValue;
			}
		}
	}

}
  
