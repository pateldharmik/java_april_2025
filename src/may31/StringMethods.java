package may31;

public class StringMethods {
    int letter = 0;
    int specialChar = 0;
    int whiteSpace = 0;
    int number = 0;

    public void Operations(String s1) {
        char[] charArray = s1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(s1.charAt(i))) {
                letter++;
            } else if (Character.isDigit(s1.charAt(i))) {
                number++;
            } else if (Character.isWhitespace(s1.charAt(i))) {
                whiteSpace++;
            } else {
                specialChar++;
            }
        }
        System.out.println("Letter " + letter);
        System.out.println("Whitespace " + whiteSpace);
        System.out.println("Number " + number);
        System.out.println("Special Character " + specialChar);
    }

    public void SubString(String s2) {
        int index = s2.indexOf("@");
        System.out.println(s2.substring(index + 1));
    }
}
