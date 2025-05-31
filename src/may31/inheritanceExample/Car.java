package may31.inheritanceExample;

public class Car extends Vehicle {
    public void which() {
        System.out.println("It is a car.");
    }

    //Overriding the accelerate method from the vehicle class
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
}
