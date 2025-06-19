package jun17;

public class DrivingAgeCheck {

	public void ageCheck(int age) {
		if (age < 18) {
			throw new UnderAgeException("Under age for driving.");
		}
		System.out.println("You can drive.");

	}

}
