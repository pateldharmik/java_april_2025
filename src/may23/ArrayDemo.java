package may23;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] rollNumbers = new int[5];

        for (int i = 0; i<rollNumbers.length; i++){
            System.out.println("Enter the " + i + " roll number:");
            rollNumbers[i] = input.nextInt();
        }

        for (int i = 0; i<rollNumbers.length; i++){
            System.out.println("Roll number " + i + " is: " + rollNumbers[i]);
        }

    }
}
