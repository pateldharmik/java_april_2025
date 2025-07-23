package jul19;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercise {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Dharmik", "Utsav", "4Sunny", "Maitree", "Shubham", "Parminder", "Jasmeet", "Edward", "Utsav", "abc", "demo");

		/* ***Exercise 1:***
		 * Make a list of String Names
		 * Use Stream to do Operations
		 * C1: must be less than 6 char
		 * C2: must not start with a number
		 * C3: must be in ascending order
		 * C4: Remove duplicates
		 * Store in a List and print the list
		 */

		List<String> namesStream = names.stream()
				.sorted()
				.distinct()
				.filter(name -> name.length() < 6)
				.filter(name -> !Character.isDigit(name.charAt(0)))
				.collect(Collectors.toList());

		System.out.println(namesStream);

		/* ***Exercise 2:***
		 * Make a class: Customer (Name,Age,Company)
		 * Make a list of Names(String)
		 * C1: must be less than 6 char
		 * C2: Create customer obj using name, for age create random number less than 100
		 * C3: For company use "Pragra.IO".
		 * C4: Print sum of all customer age
		 */

		Random rand = new Random();

		List<Customer> customers = names.stream()
				.filter(name -> name.length() < 6)
				.map(name -> new Customer(name, rand.nextInt(99), "Pragra.IO"))
				.collect(Collectors.toList());
		System.out.println(customers);

		int totalAge = customers.stream()
				.mapToInt(Customer::getAge).sum();
		System.out.println(totalAge);
	}
}
