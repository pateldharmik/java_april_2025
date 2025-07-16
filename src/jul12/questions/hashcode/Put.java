package jul12.questions.hashcode;

import java.util.HashMap;
import java.util.Map;

public class Put {

	public static void main(String[] args) {

		Map<Car, String> carOwner = new HashMap<>();

		Car car1 = new Car("Honda", "Accord", 25000, 2019);
		Car car2 = new Car("Honda", "Accord", 25000, 2019);

		carOwner.put(car1, "Dharmik");
		carOwner.put(car2, "Gunjan");

		System.out.println(carOwner);

		/*Effect on "put()"
		In the above example hashcode() is overridden but equals() is not overridden.
		Here, car2 will be checked with car1 if they are same using equals() method.
		But, since equals method is not overridden, it will use the original implementation of the method that is in the Object class.
		In the original implementation it uses '==' operator, which will also check the reference of the object along with the values.
		Since the references are different, it will create a new object essentially for the object with same data as previous one.
		Now we will be able to add multiple owners for what is essentially the same car.
		*/
	}
}
