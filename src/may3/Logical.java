package may3;

public class Logical {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int a = 15;
        int b = 25;

       boolean result1 = !((x <= y) || (x > b));
        System.out.println(result1);                        //false
       boolean result2 = ((x > y) && (a > 348));
       System.out.println(result2);                         //false
       boolean result3 = !((x >= y ) || (x > a));
        System.out.println(result3);                        //true
       boolean result4 = ((x > y ) && (x > 18));
        System.out.println(result4);                        //false
       boolean result5 = !((a >= y ) || (x > 8));
        System.out.println(result5);                        //false
       boolean result6 = !((x > y ) || (x > 23));
        System.out.println(result6);                        //true
       boolean result7 = ((b>y ) || (x > 8));
       System.out.println(result7);                         //true
       boolean result8 = ((x >= y ) || (x <= 10));
       System.out.println(result8);                         //true
       boolean result9 = ((x > y ) && (x > a));
       System.out.println(result9);                         //false
       boolean result10 = !((x == y ) || (x <= 8));
       System.out.println(result10);                        //truek
    }
}
