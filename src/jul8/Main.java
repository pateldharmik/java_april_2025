package jul8;

public class Main {
	public static void main(String[] args) {
/*

		Player d = new Player();
		d.methodB();
*/

		//making anonymous inner class
/*
		Player e = new Player() {
			public void methodB() {
				System.out.println("Anonymous inner class.");
			}
		};
		e.methodB();
*/

		// First Lambda
		Batting l = () -> System.out.println("Lambda implementation.");

		l.methodB();
	}
}