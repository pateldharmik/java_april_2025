package may27;

public class PalindromeCheckString {

    public void usingTemp(String palindrome) {
        String temp = "";
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            temp = temp + palindrome.charAt(i);
        }
        if (palindrome.equals(temp)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public boolean withoutTemp(String palindrome) {
        int start = 0;
        int last = palindrome.length() - 1;

        boolean test = true;

        while (start < last) {
            if (palindrome.charAt(start) != palindrome.charAt(last)) {
                test = false;
                break;
            }
            start++;
            last--;
        }
        return test;
    }
}
