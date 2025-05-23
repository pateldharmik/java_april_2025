package may13;

public class AnimalMain {
    public static void main(String[] args) {

        AnimalClass dog = new AnimalClass();
        dog.color = "Black";
        dog.height = 5;
        dog.weight = 10;

        System.out.println("Dog details");

        dog.eat();
        dog.sleep();
        dog.walk();
        dog.run();
        dog.details();
        System.out.println();

        AnimalClass cat = new AnimalClass();
        cat.color = "Black";
        cat.height = 5;
        cat.weight = 10;

        System.out.println("Cat details");
        cat.eat();
        cat.sleep();
        cat.walk();
        cat.run();

        cat.details();

    }
}
