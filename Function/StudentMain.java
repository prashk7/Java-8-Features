package Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentMain {

	public static void main(String[] args) {

		ArrayList<Student> l = new ArrayList<>();
		populate(l);

		Function<Student, String> fun = s -> s.marks == 100 ? "Excellent"
				: s.marks >= 80 ? "Distinction"
						: s.marks >= 60 && s.marks < 80 ? "First Class" : s.marks <= 35 ? "Fail" : "Invalid";

		for (Student s : l) {

			System.out.println("Student name is " + s.name + " and grade is = " + fun.apply(s));

		}

		Predicate<Student> p = s -> s.marks >= 60;

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
