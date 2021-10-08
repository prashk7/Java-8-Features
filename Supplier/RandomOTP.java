package Supplier;

import java.util.function.Supplier;

public class RandomOTP {

	public static void main(String[] args) {

		// Supplier to get random password
		Supplier<String> fun = () -> {

			String otp = "";

			for (int i = 0; i < 7; i++) {

				otp += (int) (Math.random() * 10); // it will generate only numbers from 0 - 9

			}
			return otp;
		};

		System.out.println("Random 7 digit OTP number is " + fun.get());

		// supplier to get random password
		Supplier<String> fun1 = () -> {

			String pwd = "";

			Supplier<Integer> numbers = () -> (int) (Math.random() * 10);

			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#@$%";

			Supplier<Character> character = () -> symbols.charAt((int) (Math.random() * 30));

			for (int i = 1; i < 7; i++) {

				if (i % 2 == 0) {
					pwd += numbers.get();
				} else {
					pwd += character.get();
				}
			}
			return pwd;
		};

		System.out.println("Randomly generated password is " + fun1.get());

	}
}
