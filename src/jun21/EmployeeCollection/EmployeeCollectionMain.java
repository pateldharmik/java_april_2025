package jun21.EmployeeCollection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollectionMain {
	public static void main(String[] args) {

		List<EmployeeCollectionDemo> list = new ArrayList<>();
		list.add(new EmployeeCollectionDemo(101, "Dharmik", 100_000));
		list.add(new EmployeeCollectionDemo(102, "Utsav", 120_000));
		list.add(new EmployeeCollectionDemo(103, "Sunny", 140_000));
		list.add(new EmployeeCollectionDemo(104, "Edward", 95_000));
		list.add(new EmployeeCollectionDemo(101, "Roop", 100_000));

		double highestSalary = 0;
		for (EmployeeCollectionDemo e : list) {
			if (e.salary > highestSalary) {
				highestSalary = e.salary;
			}
		}
		System.out.println(highestSalary);
	}
}
