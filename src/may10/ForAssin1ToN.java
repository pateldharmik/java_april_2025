package may10;

import java.util.Scanner;

public class ForAssin1ToN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number till which you want to print the numbers:");
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
}
