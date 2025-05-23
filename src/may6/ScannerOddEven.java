package may6;

import java.util.Scanner;

public class ScannerOddEven
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        int i = scanner.nextInt();

        if (i % 2 == 0) {
            System.out.println(i + " is Even");
        }
        else {
            System.out.println(i + " is Odd");
        }
    }
}
