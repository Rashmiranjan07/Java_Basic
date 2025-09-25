////Write a java program to generate a 6 digit OTP using String type ?

package Arrayprogram;

import java.util.Random;

public class OtpGenerationStr {
	public static void main(String[] args) {

		Random r = new Random();
		String otp = "";
		for (int i = 1; i < 6; i++) {
			otp = otp + r.nextInt(10);
		}
		System.out.println(otp);
	}

}