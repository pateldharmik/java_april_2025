package may27;

import java.util.Scanner;

public class PalindromeCheckStringMain {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        String palindrome;

        System.out.println("Enter a string: ");
        palindrome = name.next();

        PalindromeCheckString p = new PalindromeCheckString();

        //p.usingTemp(palindrome);

        boolean bool = p.withoutTemp(palindrome);

        if (bool) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Is not palindrome");
        }
    }
}
