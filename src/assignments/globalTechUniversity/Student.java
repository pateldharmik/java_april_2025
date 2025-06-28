package assignments.globalTechUniversity;

public class Student extends Person {
    /*Student (Inherits Person)
    o Additional Fields: studentId (String), course (String), gpa (double).
    o Constructor: Accepts name, age, studentId, course, and gpa.
        Use this to initialize studentId, course, and gpa, and super to call the base class constructor.

    o Override Methods: ▪ displayInfo(): Prints name, age, studentId, course, and gpa.
    ▪ Use polymorphism to change the output based on the Person reference type.*/

    String studentID;
    String course;
    double gpa;

    public Student(String name, int age, String studentID,String course, double gpa) {
        super(name, age);
        this.course = course;
        this.gpa = gpa;
        this.studentID = studentID;
        University.incrementStudentCount();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Course Name: " + this.course);
        System.out.println("GPA: " + this.gpa);
    }
}
