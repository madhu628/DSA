package streams;

public class Employee17 {

	private String name;
	private String department;
	private double salary;

	// Constructor
	public Employee17(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
	}

}
