package may17;

public class ConstructorCarMain {
    public static void main(String[] args) {

        //ConstructorDemoCar demoCar = new ConstructorDemoCar();
        ConstructorDemoCar demoCar1 = new ConstructorDemoCar("Civic", "Honda");
        ConstructorDemoCar demoCar2 = new ConstructorDemoCar("Mustang");
        ConstructorDemoCar demoCar3 = new ConstructorDemoCar("TT", "Audi", "v8");
        ConstructorDemoCar demoCar4 = new ConstructorDemoCar("Accord", "Honda", "Twin Turbo", "Blue");
        ConstructorDemoCar demoCar5 = new ConstructorDemoCar("3 series", "BMW", "v12", "Black", 450);

        demoCar1.print();
        System.out.println("*********************************");
        demoCar2.print();
        System.out.println("*********************************");
        demoCar3.print();
        System.out.println("*********************************");
        demoCar4.print();
        System.out.println("*********************************");
        demoCar5.print();
        System.out.println("*********************************");
    }
}
