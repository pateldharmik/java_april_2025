package may20;

public class LibraryManagementStatic {
    String studentName;
    String bookTitle;
    String author;
    static int totalBooksIssued = 0;

    public LibraryManagementStatic(String studentName, String bookTitle) {
        this.studentName = studentName;
        this.bookTitle = bookTitle;
        totalBooksIssued++;
    }

    public void printInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Total Books Issued: " + totalBooksIssued);
    }

//    static public void bookReturned(String studentName, String bookTitle) {
//        totalBooksIssued--;
//    }

    static void showTotalIssued() {
        System.out.println("Total Books Issued: " + totalBooksIssued);
    }
}
