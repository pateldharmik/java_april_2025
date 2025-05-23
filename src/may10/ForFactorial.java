package may10;

import java.util.Scanner;

public class ForFactorial {
    public static void main(String[] args) {

        int fact = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value you need factorial of:");
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + x + " is: " + fact);
    }
}
