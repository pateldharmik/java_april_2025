package may3;

public class IfAssignment {
    public static void main(String[] args) {
        // given 3 numbers, check the largest number of all x=10,y=15,z=12.
        int x = 10;
        int y = 15;
        int z = 12;

        if ( x >= y && x >= z) {
            System.out.println(x + " is the greatest number");
        }else if ( y >= z) {
            System.out.println(y + " is the greatest number");
        }else {
            System.out.println(z + " is the greatest number");
        }
    }
}