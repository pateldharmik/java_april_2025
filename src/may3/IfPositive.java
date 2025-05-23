package may3;


public class IfPositive {
    public static void main(String[] args) {
        int x = -10;

        if(x < 0){
            System.out.println(x + " is negative");
        }
        else if (x == 0){
            System.out.println(x + " is zero");
        }
        else {
            System.out.println(x + " is positive");
        }
    }
}
