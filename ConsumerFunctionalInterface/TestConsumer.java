package ConsumerFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);

		c.accept("Hello");

		ArrayList<Movie> list = new ArrayList<>();
		populate(list);

		Consumer<Movie> fun1 = m -> {
			System.out.println("Movie name " + m.name);
			System.out.println("Hero name " + m.hero);
			System.out.println("Heroine name " + m.heroine);
		};
		for (Movie m : list) {
			fun1.accept(m);
		}
	}

	private static void populate(ArrayList<Movie> list) {
		// TODO Auto-generated method stub

		list.add(new Movie("Ulidavaru Kandanthe", "Rakshit", "Ashika"));
		list.add(new Movie("Tagaru", "Daali", "Shivanna"));
		list.add(new Movie("Pancharangi", "Digu", "Andy"));

	}

}
