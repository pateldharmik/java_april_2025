package may10;

import java.util.Scanner;

public class DoWhile1ToN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a limit:");
        int x = scanner.nextInt();
        int y = 1;

        do{
            System.out.println(y);
            y++;

        }while(y <= x);
    }
}
