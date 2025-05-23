package may17;

public class ChainingConstructor {

    String brand;
    int Capacity;

    public ChainingConstructor() {
        System.out.println("Hello World");
    }

    public ChainingConstructor(String brand) {
        this();
        this.brand = brand;
        System.out.println("Hello Pragra");
    }

    public ChainingConstructor(String brand, int capacity) {
        this("dell");
        this.brand = brand;
        Capacity = capacity;
        System.out.println("hello Students");
    }
}
