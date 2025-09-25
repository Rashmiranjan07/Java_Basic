//Write a java program to generate a 6 digit OTP using int type ?

package Arrayprogram;

import java.util.Random;

public class OtpGenerationInt {
	public static void main(String[] args) {

		Random r = new Random();
		int otp = 0;
		for (int i = 1; i <= 6; i++) {
			int temp = r.nextInt(10);
			otp = (otp * 10) + temp;
		}
		System.out.println(otp);
	}

}
