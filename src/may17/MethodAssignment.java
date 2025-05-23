package may17;

public class MethodAssignment {
    /*
    x = 10, y = 20 swap values.
    1. using third variable
    2. without using third variable
    */

    int x;
    int y;

    public void swap(int x, int y, int temp) {

        System.out.println("Using temp variable");
        System.out.println("Before Values: x = " + x + "y = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Values: x = " + x + " y = " + y);
    }

    public void swap(int x, int y) {
        System.out.println("Without temp variable");
        System.out.println("Before Values: x = " + x + " y = " + y);
        x = (x + y) - x;
        y = (x + y) - y;
        System.out.println("After Values: x = " + x + " y = " + y);
    }

    public static void main(String[] args) {
        MethodAssignment demo = new MethodAssignment();
        demo.swap(10, 20, 0);
        demo.swap(10, 20);
    }

}
