package Function;

import java.util.function.Function;

public class CheckFunctionInterface {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();

		System.out.println(f.apply("Prashant"));

		Function<Integer, Integer> f1 = i -> i * i;

		System.out.println(f1.apply(25));

		// to find the no of spaces in given string
		Function<String, Integer> f2 = s -> s.length() - s.replaceAll(" ", "").length();
		
		System.out.println(f2.apply("I am   Software Engineer"));

	}
}
