package PredicateFunctionalInterface;

import java.util.function.Predicate;

public class CheckPredicate {

	public static void main(String[] args) {

		/*
		 * Predicate<Integer> p = I -> I > 10;
		 * 
		 * System.out.println(p.test(100)); System.out.println(p.test(-2));
		 */

		int[] x = { 0, 5, 10, 15, 20, 25, 30 };

		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("the numbers greater than 10 are");
		m1(p1, x);

		System.out.println("the numbers are even");
		m1(p2, x);

		System.out.println("The numbers are not greated than 10");
		m1(p1.negate(), x);

		System.out.println("The numbers are greater than 10 and even");
		m1(p1.and(p2), x);

		System.out.println("The numbers are greater than 10 or even");
		m1(p1.or(p2), x);
	}

	public static void m1(Predicate<Integer> p, int[] x) {

		for (int a : x) {
			if (p.test(a)) {
				System.out.println(a);
			}
		}

	}
}
