package Function;

import java.util.function.Function;

public class TestDefaultMethods {

	public static void main(String[] args) {

		Function<String, String> fun1 = s -> s.toUpperCase();

		Function<String, String> fun2 = s -> s.substring(0, 9);

		
		System.out.println(fun1.andThen(fun2).apply("Aishwaryaabhi"));
		
		System.out.println(fun1.compose(fun2).apply("Aishwaryaabhi"));
	}
}
