package may10;

import java.util.Scanner;

public class ForAssignTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to print the table of:");
        int x = scanner.nextInt();

        System.out.println("Enter the number till which you want to print the table:");
        int y = scanner.nextInt();

        int mul = 1;

        for (int i = 1; i <= y; i++) {
            mul = i * x;
            System.out.println(x + " * " + i + " = " + mul);
        }

    }
}