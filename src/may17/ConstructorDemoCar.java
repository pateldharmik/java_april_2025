package may17;

public class ConstructorDemoCar {

    String name;
    String brand;
    String engineType;
    String color;
    int horsePower;

    public ConstructorDemoCar() {
        System.out.println("Default Constructor is called");
    }


    public ConstructorDemoCar(String name) {
        this();
        this.name = name;
    }

    public ConstructorDemoCar(String name, String brand) {
        this();
        this.name = name;
        this.brand = brand;
    }

    public ConstructorDemoCar(String name, String brand, String engineType) {
        this();
        this.name = name;
        this.brand = brand;
        this.engineType = engineType;
    }

    public ConstructorDemoCar(String name, String brand, String engineType, String color) {
        this();
        this.name = name;
        this.brand = brand;
        this.engineType = engineType;
        this.color = color;
    }

    public ConstructorDemoCar(String name, String brand, String engineType, String color, int horsePower) {
        this();
        this.name = name;
        this.brand = brand;
        this.engineType = engineType;
        this.color = color;
        this.horsePower = horsePower;
    }

    public void print() {
        System.out.println("The name is " + name);
        System.out.println("The brand is " + brand);
        System.out.println("The engine type is " + engineType);
        System.out.println("The color is " + color);
        System.out.println("The horse power is " + horsePower);
    }
}
