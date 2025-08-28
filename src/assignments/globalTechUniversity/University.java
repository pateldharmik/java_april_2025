package assignments.globalTechUniversity;

public class University {
    //Class: University
    // o Static Fields: ▪ universityName (String) ▪ totalStudents (int) ▪ totalProfessors (int).
    // o Static Methods: ▪ setUniversityName(String name): Sets the university name.
    // ▪ incrementStudentCount(): Increments the totalStudents counter.
    // ▪ incrementProfessorCount(): Increments the totalProfessors counter.
    // ▪ getStatistics(): Returns the university name, total students, and total professors.

    static String universityName;
    static int totalStudents = 0;
    static int totalProfessors = 0;

    static public void setUniversityName(String universityName) {
        University.universityName = universityName;
    }

    static public void incrementStudentCount() {
        totalStudents++;
    }

    static public void incrementProfessorCount() {
        totalProfessors++;
    }

    static public void getStatistics() {
        System.out.println("*****University Statistics are*****");
        System.out.println("Name of university is: " + universityName);
        System.out.println("Total number of students are: " + totalStudents);
        System.out.println("Total number of professors are: " + totalProfessors);
    }
}
