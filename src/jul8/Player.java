package jul8;

public class Player implements Batting, Bowling {

	@Override
	public void methodA() {

	}

	@Override
	public void methodB() {
		Batting.super.methodB();
		Bowling.super.methodB();
		System.out.println("I am an all rounder.");
}

	@Override
	public void methodC() {

	}
}
