package PredicateFunctionalInterface;

public class Employee {

	String username;
	String designation;
	double salary;
	String location;

	public Employee(String username, String designation, double salary, String location) {
		super();
		this.username = username;
		this.designation = designation;
		this.salary = salary;
		this.location = location;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", salary=" + salary + ", location=" + location + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee) obj;
		if (username.equals(e.username) && designation.equals(e.designation) && salary == e.salary)
			return true;

		return false;
	}

}
