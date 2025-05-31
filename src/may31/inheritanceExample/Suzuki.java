package may31.inheritanceExample;

public class Suzuki extends Bike {
    public void maker() {
        System.out.println("It is a Suzuki.");
    }

    //Overriding the accelerate method from the vehicle class
    public void breaking() {
        System.out.println("Suzuki is breaking");
    }
}