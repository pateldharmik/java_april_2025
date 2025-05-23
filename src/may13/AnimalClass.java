package may13;

public class AnimalClass {
    int height;
    int weight;
    String color;

    public void eat() {
        System.out.println(color + " animal is eating");
    }

    public void sleep() {
        System.out.println(color + " animal is sleeping");
    }

    public void run() {
        System.out.println(color + " animal is running");
    }

    public void walk() {
        System.out.println(color + " animal is walking");
    }

    public void details() {
        System.out.println("Color: " + color);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}
