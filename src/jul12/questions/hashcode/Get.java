package jul12.questions.hashcode;

import java.util.HashMap;
import java.util.Map;

public class Get {
	public static void main(String[] args) {
		Map<Car, String> carOwners = new HashMap<>();

		Car car1 = new Car("Honda", "Accord", 25000, 2019);

		carOwners.put(car1, "Dharmik");

		String owner = carOwners.get(new Car("Honda", "Accord", 25000, 2019));
		System.out.println(owner);

		/*Effect on "get()"
		Here, a new entry is made with the values given above.
		When we try to retrieve the value for the key using get(), the map will correctly point towards the right bucket.
		It will compare the "new Car...." object from the get statement to the object in the memory.
		But, since the equals() is not overridden, it will compare both reference and the value with each other.
		Since the reference is not matching, this will return a 'null' value.
		*/
	}
}
