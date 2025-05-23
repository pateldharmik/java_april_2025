package may10;

import java.util.Scanner;

public class DoWhileCalculator {
    public static void main(String[] args) {

        boolean calculator = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();

            System.out.println("**********************");
            System.out.println("Choose your operation:");
            System.out.println("**********************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("0. Exit");

            int operation = scanner.nextInt();

            if (operation == 1) {
                int sum = num1 + num2;
                System.out.println("The sum of the 2 numbers :" + sum);
            } else if (operation == 2) {
                int subtraction = num1 - num2;
                System.out.println("The subtraction of the 2 numbers :" + subtraction);
            } else if (operation == 3) {
                int multiplication = num1 * num2;
                System.out.println("Multiplication of the 2 numbers is: " + multiplication);
            } else if (operation == 4) {
                int division = num1 / num2;
                System.out.println("Division of the 2 numbers are: " + division);
            } else if (operation == 5) {
                int modulo = num1 % num2;
                System.out.println("Modulo of the 2 numbers are: " + modulo);
            } else if (operation == 0) {
                System.out.println("Exiting the calculator...");
                calculator = false;
            } else {
                System.out.println("Invalid operation");
            }
        } while (calculator);
    }
}