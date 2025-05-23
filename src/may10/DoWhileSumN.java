package may10;

import java.util.Scanner;

public class DoWhileSumN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number till which you want to sum the numbers:");
        int x = scanner.nextInt();
        int y = 0;
        int sum = 0;
        do{
           sum = sum + y;
           y++;
        }while(y <= x);
        System.out.println( sum);
    }

}
