package may10;

import java.util.Scanner;

public class LoopSumN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number till where you want to sum the numbers:");

        int x = 0;
        int y = scanner.nextInt();
        int sum = 0;
        while( x <= y){
            sum = sum + x;
            x++;
        }
        System.out.println("The sum of the numbers till " + y + " is: " + sum);
    }
}
