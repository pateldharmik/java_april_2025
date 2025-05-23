package may10;

import java.util.Scanner;

public class ForAssignSumN {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number till you want the sum of the numbers:");
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++){
            sum = sum +i;
        }
        System.out.println("The sum of the numbers till " + x + " is:" + sum );
    }
}
