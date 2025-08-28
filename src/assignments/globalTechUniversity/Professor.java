package assignments.globalTechUniversity;

public class Professor extends Person {
//    o Additional Fields: employeeId (String), department (String), salary (double).
//    o Constructor: Accepts name, age, employeeId, department, and salary.
//    Use this and super appropriately.
//    o Override Methods: ▪ displayInfo(): Prints name, age, employeeId, department, and salary.

    String employeeID;
    String department;
    double salary;

    public Professor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.department = department;
        this.employeeID = employeeID;
        this.salary = salary;
        University.incrementProfessorCount();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + this.department);
        System.out.println("EmployeeID: " + this.employeeID);
        System.out.println("Salary: " + this.salary);
    }
}
