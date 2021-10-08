package Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import PredicateFunctionalInterface.Employee;

public class TestEmployee {
		public static void main(String[] args) {

		ArrayList<Employee> l1 = new ArrayList<>();
		populate(l1);

		// function to calculate the total salary
		Function<ArrayList<Employee>, Double> fun1 = list -> {
			double total = 0;

			for (Employee e : list) {
				total += e.getSalary();
			}

			return total;
		};
		System.out.println("total salary " + fun1.apply(l1));

		// function to increment the salary whose salary is less than 10k
		ArrayList<Employee> result = new ArrayList<>();

		Predicate<Employee> p = emp -> emp.getSalary() < 10000;
		Function<Employee, Employee> func2 = emp -> {
			emp.setSalary(emp.getSalary() + 500);
			return emp;
		};
		
		
		for (Employee e : l1) {

			if (p.test(e)) {
				func2.apply(e);
				result.add(e);
			}
		}

		System.out.println("Incremented empployees are " + result);

	}

	private static void populate(ArrayList<Employee> l) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Prashant", "Owner", 1000, "Bengaluru");
		Employee e2 = new Employee("Pooja", "CEO", 2000, "Bengaluru");
		Employee e3 = new Employee("XYZ", "CEO", 3000, "Bengaluru");
		Employee e4 = new Employee("ABC", "CEO", 10000, "Bengaluru");
		Employee e5 = new Employee("PQR", "CEO", 12000, "Bengaluru");

		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);

	}
}
