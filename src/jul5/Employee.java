package jul5;

public class Employee {
	private String id;
	private String firstName;
	private String lastName;
	private double salary;
	private String company;

	@Override
	public String toString() {
		return "Employee{" +
				"id='" + id + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", salary=" + salary +
				", company='" + company + '\'' +
				'}';
	}

	public Employee(String id, String firstName, String lastName, double salary, String company) {
		this.company = company;
		this.firstName = firstName;
		this.id = id;
		this.lastName = lastName;
		this.salary = salary;
	}
}
