package assignments.globalTechUniversity;

public class Person {
	//    Base Class:
//    Person
//    o Fields:
//    name (String), age (int).
//    o Constructor: Accepts name and age.
//    o Methods: ▪ public void displayInfo(): Prints name and age.
//    ▪ A final method getType(): Returns "Person".

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public final Person getType() {
		return this;
	}
}
