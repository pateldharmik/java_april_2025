package may6;

import java.util.Scanner;

public class ScannerOffice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your mood(true/false):");
        boolean mood = scanner.nextBoolean();

        if(mood){
            System.out.println("In the mood to go to the office");
        }
        else{
            System.out.println("Not in the mood to go to the office");
        }
    }
}
