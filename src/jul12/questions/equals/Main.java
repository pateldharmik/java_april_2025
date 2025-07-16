package jul12.questions.equals;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<Car, String> carOwner = new HashMap<>();

		Car car1 = new Car("Honda", "Accord", 25000, 2019);
		Car car2 = new Car("Honda", "Accord", 25000, 2019);

		carOwner.put(car1, "Dharmik");

		String owner = carOwner.get(car2);
		System.out.println(owner);

		/*
		Effect on "put()"
		Here, since the hashcode() is not overridden, default hashcode() implementation from Object class will be used.
		According to the default implementation, in the above example, hashcodes of both the car objects will be different.
		So both the objects, which are same, will be placed in different buckets in the memory.
		FYI: If both hashcode() and equals() were overridden, then car1 and car2 would be the same object.

		Effect on "get()"
		When, get() is called in the above program, it should look for car2 which is at different location from car1 (even though they are same values).
		Since, the hashcodes were different, the value for car2 is empty, thus it will return the 'null' value.
		If we have to look for a specific item, then we need to look for it using its exact same object.

		**If both hashcode() and equals() were overridden, then there would have been only 1 car object and the associated value.**
		*/
	}
}
