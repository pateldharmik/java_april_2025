package may6;


import java.util.Scanner;

public class ScannerPositive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        int x = scanner.nextInt();

        if(x < 0){
            System.out.println(x + " is negative");
        }
        else if (x == 0){
            System.out.println(x + " is zero");
        }
        else {
            System.out.println(x + " is positive");
        }
    }
}
