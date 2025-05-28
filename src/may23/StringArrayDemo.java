package may23;

import java.util.Scanner;

public class StringArrayDemo {

    Scanner input = new Scanner(System.in);
    String[] name = new String[5];

    public void getName() {

        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter the " + i + " name:");
            name[i] = input.next();
            ;
        }
    }

    public void printName() {
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name " + i + " is: " + name[i]);
        }
    }
}
