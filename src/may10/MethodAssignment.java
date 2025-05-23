package may10;

import java.util.Scanner;

public class MethodAssignment {
    public static void main(String[] args) {
        //Write the entire code of calculator using methods.

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
                addition(number1(), number2());
                break;

            case 2:
               subtraction(number1(), number2());
               break;

            case 3:
                multiplication(number1(), number2());
                break;

            case 4:
                division(number1(), number2());
                break;

            case 5:
                modulo(number1(), number2());
                break;

            case 0:
                System.out.println("Exiting the calculator.");
                break;

            default:
                System.out.println("Invalid operation");
                break;
        }
    }

    public static int number1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        return num1;
    }

    public static int number2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        return num2;
    }

    public static void addition(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    public static void subtraction(int num1, int num2){
        int sub = num1 - num2;
        System.out.println("The subtaction of " + num1 + " and " + num2 + " is: " + sub);
    }

    public static void multiplication(int num1, int num2){
        int mul = num1 * num2;
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + mul);
    }

    public static void division(int num1, int num2){
        int div = num1 / num2;
        System.out.println("The subtaction of " + num1 + " and " + num2 + " is: " + div);
    }

    public static void modulo(int num1, int num2){
        int mod = num1 % num2;
        System.out.println("The subtaction of " + num1 + " and " + num2 + " is: " + mod);
    }
}