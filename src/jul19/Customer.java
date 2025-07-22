package jul19;

import lombok.Getter;

public class Customer {
	String name;
	@Getter
	int age;
	String company;

	public Customer(String name, int age, String company) {
		this.name = name;
		this.age = age;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"age=" + age +
				", name='" + name + '\'' +
				", company='" + company + '\'' +
				'}';
	}
}
