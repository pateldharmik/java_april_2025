package jul8;

@FunctionalInterface
public interface Bowling {

	void methodC();

	//default Method
	default void methodB() {
		System.out.println("I can bowl.");
	}
}
