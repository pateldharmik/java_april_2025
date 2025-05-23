package may17;

public class MethodOverloadingDemo2 {
    public int salary(int baseSalary) {
        return baseSalary;
    }

    public int salary(int baseSalary, int bonus) {
        return baseSalary + bonus;
    }

    public int salary(int baseSalary, int bonus, int incentive) {
        return baseSalary + bonus + incentive;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 demo = new MethodOverloadingDemo2();
        System.out.println("Total salary is: " + demo.salary(1000));
        System.out.println("Total salary is: " + demo.salary(1000, 200));
        System.out.println("Total salary is: " + demo.salary(1000, 200, 300));
    }
}
