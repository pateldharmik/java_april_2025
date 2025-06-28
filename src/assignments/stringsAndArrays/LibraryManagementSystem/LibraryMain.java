package assignments.stringsAndArrays.LibraryManagementSystem;

import java.util.Scanner;

public class LibraryMain {
	public static void main(String[] args) {

		String[] books = {"Lord of the Rings","Song of Fire and Ice","Harry Potter","Dune","Origin","Kalki"};

		Library lib = new Library(books);

		lib.showBooks();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book title you would like to check:");
		String checkBook = sc.nextLine();

		lib.updateBook(checkBook);

		lib.showBooks();
	}
}
