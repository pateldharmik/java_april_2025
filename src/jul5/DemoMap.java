package jul5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
	public static void main(String[] args) {


		String s = "Dharmik";
//		System.out.println(s.hashCode());

		Map<String, Employee> employeeMap = new HashMap<String, Employee>();
		employeeMap.put("E001", new Employee("E001", "Dharmik", "Patel", 100_000, "XYZ Inc."));
		employeeMap.put("E002", new Employee("E002", "Utsav", "Patel", 120_000, "ABC Inc."));
		employeeMap.put("E003", new Employee("E003", "Edward", "S.", 140_000, "IJK Inc."));
		employeeMap.put("E004", new Employee("E004", "Sunny", "Kumar", 80_000, "DEF Inc."));
		employeeMap.put("E005", new Employee("E005", "Shubham", "Patel", 100_000, "Demo Inc."));
		employeeMap.putIfAbsent("E005", new Employee("E005", "Maitree", null, 110_000, "Demo Inc."));

//		System.out.println(employeeMap);
//		System.out.println(employeeMap.get("E002"));
//		System.out.println(employeeMap.values());
//		System.out.println(employeeMap.keySet());
		System.out.println(employeeMap.get("E001").hashCode());
		System.out.println(employeeMap.get("E002").hashCode());
		System.out.println(employeeMap.get("E003").hashCode());
		System.out.println(employeeMap.get("E004").hashCode());
		System.out.println(employeeMap.get("E005").hashCode());

		Set<Map.Entry<String, Employee>> entries = employeeMap.entrySet();
		for (Map.Entry<String, Employee> entry : entries) {
//			System.out.println(entry.getValue());
		}
	}
}