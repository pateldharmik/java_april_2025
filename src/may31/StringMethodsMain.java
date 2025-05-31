package may31;

import java.util.Scanner;

public class StringMethodsMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1 = input.nextLine();

        StringMethods methods = new StringMethods();
        methods.Operations(s1);

        System.out.println("Enter Email ID as a string: ");
        String s2 = input.nextLine();

        methods.SubString(s2);
    }
}