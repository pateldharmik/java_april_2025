package may17;

public class MethodOverloadingDemo1 {

    public String greeting(String name) {
        return "Hello " + name;
    }

    public String greeting(String name, String middleName) {
        return "Hello " + name + " " + middleName;
    }

    public String greeting(String name,String middleName, String lastName){
        return "Hello " + name + " " + middleName + " " + lastName;
    }

    public String greeting(int a, int b , String s){
        return a + b + s;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo1 demo = new MethodOverloadingDemo1();

        System.out.println(demo.greeting("Dharmik"));
        System.out.println(demo.greeting("Dharmik", "A"));
        System.out.println(demo.greeting("Dharmik", "A", "Patel"));
        System.out.println(demo.greeting(1,2," Hello"));

    }
}
