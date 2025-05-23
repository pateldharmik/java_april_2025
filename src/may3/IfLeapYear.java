package may3;

public class IfLeapYear {
    public static void main(String[] args) {
        int year = 2027;

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
