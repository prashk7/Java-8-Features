package PredicateFunctionalInterface;

import java.util.function.Predicate;

public class EmployeeMain {

	public static void main(String[] args) {

		Predicate<Employee> p = Predicate.isEqual(new Employee("Prashant", "Owner", 10000000, "Bengaluru"));
		
		
		Employee e1 = new Employee("Prashant", "Owner", 10000000, "Bengaluru");
		Employee e2 = new Employee("Pooja", "CEO", 1000000, "Bengaluru");
		
		System.out.println(p.test(e1));
		System.out.println(p.test(e2));
		

	}
}
