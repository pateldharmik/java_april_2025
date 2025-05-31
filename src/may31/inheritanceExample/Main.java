package may31.inheritanceExample;

public class Main {
    public static void main(String[] args) {
        Suzuki suzuki = new Suzuki();
        suzuki.drive();
        suzuki.what();
        suzuki.maker();
        suzuki.accelerate();
        suzuki.breaking();
        suzuki.stop();


        System.out.println();
        Honda honda = new Honda();
        honda.drive();
        honda.which();
        honda.make();
        honda.accelerate();
        honda.breaking();
        honda.stop();

    }
}
