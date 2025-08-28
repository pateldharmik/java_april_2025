package assignments.globalTechUniversity;

public class DepartmentHead extends Professor {
    /*DepartmentHead (Inherits Professor)
    o Additional Field: officeRoom (String).
    o Constructor: Accepts all Professor parameters plus officeRoom.
    o Override Methods: ▪ displayInfo(): Prints all Professor details along with officeRoom.*/

    String officeRoom;

    public DepartmentHead(String name, int age,  String employeeID,String department, double salary, String officeRoom) {
        super(name, age, department, employeeID, salary);
        this.officeRoom = officeRoom;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office Room: " + this.officeRoom);
    }
}
