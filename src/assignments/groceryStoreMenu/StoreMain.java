package assignments.groceryStoreMenu;

import java.util.Scanner;

import static assignments.groceryStoreMenu.StoreMenu.*;

public class StoreMain {
	public static void main(String[] args) {

		String itemCode;

		Scanner sc = new Scanner(System.in);
		System.out.println("***Welcome to Grocery Store***");

		boolean done = true;

		do {
			DisplayMenu.displayMenu();
			System.out.println("Select the item code(A-E) or Q for exit:");
			itemCode = sc.next();

			double itemPrice = 0.00;
			String itemName = "";

			switch (itemCode) {
				case "A":
					itemPrice = itemPrices[0];
					itemName = itemNames[0];
					break;
				case "B":
					itemPrice = itemPrices[1];
					itemName = itemNames[1];
					break;
				case "C":
					itemPrice = itemPrices[2];
					itemName = itemNames[2];
					break;
				case "D":
					itemPrice = itemPrices[3];
					itemName = itemNames[3];
					break;
				case "E":
					itemPrice = itemPrices[4];
					itemName = itemNames[4];
					break;
				case "Q":
					System.out.println("Goodbye!");
					done = false;
					DisplayBill.displayBill();
					break;
				default:
					System.out.println("Invalid input!");
					break;
			}

			try {
				AddItem.addItem(itemName, itemPrice);
				System.out.println(itemName + " added successfully!");
			} catch (InsufficienetBalanceException e) {
				System.out.println(e.getMessage());
				System.out.println("Can not add item " + e.getItemName() + ". Adding a item of price" + e.getItemPrice() + "will make the total go over budget.");
				System.out.println(e.getItemName() + " cancelled");
			}
		} while (done);
	}
}
