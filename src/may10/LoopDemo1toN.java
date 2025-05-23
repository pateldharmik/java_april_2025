package may10;

import java.util.Scanner;

public class LoopDemo1toN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number where you want to stop the loop:");

        int x = 1;
        int y = scanner.nextInt();

        while(x<=y){
            System.out.println(x);
            x++;
        }
    }
}
