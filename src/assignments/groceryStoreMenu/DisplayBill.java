package assignments.groceryStoreMenu;

import static assignments.groceryStoreMenu.StoreMenu.*;

public class DisplayBill {
	static public void displayBill() {
		System.out.println("*****Your Bill*****");
		System.out.println("Initial Balance : " + balance);
		System.out.println("Total Bill : " + currentTotal);

		if (cartCount > 0) {
			System.out.println("Items in your bill : ");
			for (int i = 0; i < cartCount; i++) {
				System.out.println(" - " + cart[i]);
			}
		} else {
			System.out.println(" No items in your bill");
		}
		System.out.println("-------------------------------------");
	}
}
