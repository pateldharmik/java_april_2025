package assignments.stringsAndArrays.LibraryManagementSystem;

import java.util.Scanner;

public class Library {
//	Library Book Management
//	A library stores a list of book titles.
//	Create a Java program that uses a string array to store 6 book titles.
//	Write functions that: • Searches for a specific book title entered by the user.
//	• Replaces a specific book title in the array if a user wants to update the library records.

	String[] books = new String[6];

	public Library(String[] books) {
		this.books = books;
	}

	public void showBooks() {
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
	}

	public void updateBook(String book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i].equalsIgnoreCase(book)) {

				System.out.println("Book available in the library. Would you like to replace it?(Yes/No)");

				Scanner sc = new Scanner(System.in);
				String choice = sc.nextLine();

				switch (choice) {
					case "Yes", "Y", "y","yes":
						System.out.println("Please enter the name of the new book:");
						books[i] = sc.nextLine();
						break;

					case "No", "N", "n","no":
						break;

					default:
						System.out.println("Invalid input!");
				}

			}

		}
	}
}
