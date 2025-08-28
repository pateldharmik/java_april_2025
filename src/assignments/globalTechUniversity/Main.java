package assignments.globalTechUniversity;

import java.util.Scanner;

public class Main {
    //Class: Main
    // o Set the university name using the static method in the University class.
    // o Create an array of Person references containing a mix of Student, Professor, and DepartmentHead objects.
    // o Iterate over the array and call displayInfo() on each object (demonstrating polymorphism).
    // o Increment the totalStudents and totalProfessors counters whenever a Student or Professor object is added.
    // o Display the university statistics at the end.

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the university");

        University.universityName = sc.nextLine();


        Person p1 = new Student("Alice Smith", 20, "S12345", "Computer Science", 3.9);

        /*Person type = people[0].getType();
        System.out.println(type.getClass().getSimpleName());*/

        Person p2 = new Professor("Dr. John Doe", 45, "P67890", "Software Engineering", 95000);

        Person p3 = new DepartmentHead("Dr. Sarah Lee", 50, "P98765", "Computer Science", 120000, "A-105");

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();

        University.getStatistics();

    }
}
