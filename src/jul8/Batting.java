package jul8;

@FunctionalInterface
public interface Batting {

	void methodA();

	//default Method
	default void methodB() {
		System.out.println("I can bat.");
	}
}
