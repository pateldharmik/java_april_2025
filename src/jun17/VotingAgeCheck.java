package jun17;

public class VotingAgeCheck {
	public void ageCheck(int age) {
		if (age < 21) {
			throw new UnderAgeException("Under age for voting.");
		}
		System.out.println("You can vote.");
	}
}
