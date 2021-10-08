package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<Date> sup = () -> new Date();

		System.err.println(sup.get());

		Supplier<String> sup1 = () -> {

			String[] arr = { "Virat", "PK", "Abd", "MaxiWell" };

			int val = (int) (Math.random() * 4);

			return arr[val];
		};

		
		System.out.println(sup1.get());
		
		System.out.println(sup1.get());
		System.out.println(sup1.get());
		System.out.println(sup1.get());
	}

}
