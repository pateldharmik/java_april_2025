package may3;

public class Comparison {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int a = 15;
        int b = 25;

        System.out.println(x < y);      //true
        System.out.println(x > y);      //false
        System.out.println(x < a);      //true
        System.out.println(b < y);      //false
        System.out.println(x <= y);     //true
        System.out.println(a >= y);     //false
        System.out.println(x != b);     //true
        System.out.println(x == y);     //false
        System.out.println(a == y);     //false
        System.out.println(x == y);     //false

    }
}
