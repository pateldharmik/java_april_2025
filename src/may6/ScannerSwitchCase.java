package may6;

import may10.MethodAssignment;

import java.util.Scanner;

public class ScannerSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("0. Exit");
        System.out.println("**********************");
        System.out.println("Choose your operation:");

        int operation = scanner.nextInt();
        switch (operation) {
            case 1:
                MethodAssignment.addition(MethodAssignment.number1(), MethodAssignment.number2());
                break;

            case 2:
                MethodAssignment.subtraction(MethodAssignment.number1(), MethodAssignment.number2());
                break;

            case 3:
                MethodAssignment.multiplication(MethodAssignment.number1(), MethodAssignment.number2());
                break;

            case 4:
                MethodAssignment.division(MethodAssignment.number1(), MethodAssignment.number2());
                break;

            case 5:
                MethodAssignment.modulo(MethodAssignment.number1(), MethodAssignment.number2());
                break;

            case 0:
                System.out.println("Exiting the calculator.");
                break;

            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
