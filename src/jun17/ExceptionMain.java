package jun17;

import java.util.Scanner;

public class ExceptionMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();

		DrivingAgeCheck check = new DrivingAgeCheck();
		VotingAgeCheck vc = new VotingAgeCheck();

		try {
			check.ageCheck(age);
			vc.ageCheck(age);
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
	}
}
