package jun3.polyDemo;

public class Main {
    public static void main(String[] args) {
        Vehicle honda = new Honda();
        honda.run();
        honda.accelerate();
        honda.stop();

        System.out.println();
        Vehicle hyundai = new Hyundai();
        hyundai.run();
        hyundai.accelerate();
        hyundai.stop();

        System.out.println();
        Vehicle audi = new Audi();
        audi.run();
        audi.accelerate();
        audi.stop();

    }
}
