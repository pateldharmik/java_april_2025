package may20;

public class LibraryManagementMain {
    public static void main(String[] args) {
        LibraryManagementStatic lib = new LibraryManagementStatic("Dharmik Patel", "OOPS");
        lib.printInfo();
        System.out.println();
        LibraryManagementStatic lib2 = new LibraryManagementStatic("Edward", "Harry Potter");
        lib2.printInfo();
        System.out.println();

       //LibraryManagementStatic.bookReturned("Demo Name", "Book Name");

        LibraryManagementStatic lib3 = new LibraryManagementStatic("Sunny", "Song of fire and ice");
        lib3.printInfo();
        System.out.println();

        LibraryManagementStatic.showTotalIssued();
    }
}
