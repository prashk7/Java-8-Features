package ConsumerFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import Function.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> l = new ArrayList<>();
		populate(l);

		Predicate<Student> p = s -> s.marks >= 60;

		Function<Student, String> fun1 = s -> {

			int marks = s.marks;
			return marks >= 80 ? "A"
					: marks < 80 && marks >= 60 ? "B+"
							: marks > 40 && marks < 60 ? "B" : marks > 35 && marks < 40 ? "C" : "F";

		};

		Consumer<Student> func2 = s -> {

			System.out.println("Student name " + s.name);

		};

		for (Student s : l) {

			if (p.test(s)) {
				fun1.apply(s);
				func2.accept(s);
			}

		}

	}

	private static void populate(ArrayList<Student> l) {
		// TODO Auto-generated method stub

		Student s1 = new Student("ABD", 75);
		Student s2 = new Student("Bharat", 80);
		Student s3 = new Student("Chahal", 20);
		Student s4 = new Student("Virat", 50);
		Student s5 = new Student("MaxiWell", 100);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);

	}
}
