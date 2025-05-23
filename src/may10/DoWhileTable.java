package may10;

import java.util.Scanner;

public class DoWhileTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to print the table of:");
        int x = scanner.nextInt();

        System.out.println("Enter the number till which you want to print the table:");
        int y = scanner.nextInt();

        int i = 1;
        int mul = 1;

        do {
            mul = i * x;
            System.out.println(x + " * " + i + " = " + mul);
            i++;
        } while (i <= y);

    }
}
