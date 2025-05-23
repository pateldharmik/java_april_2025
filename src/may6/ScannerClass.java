package may6;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for X:");
        int x = scanner.nextInt();

        System.out.println("Enter value for Y:");
        int y = scanner.nextInt();

        System.out.println("Enter value for Z:");
        int z = scanner.nextInt();

        if ( x >= y && x >= z) {
            System.out.println(x + " is the greatest number");
        }else if ( y >= z) {
            System.out.println(y + " is the greatest number");
        }else {
            System.out.println(z + " is the greatest number");
        }

    }
}
