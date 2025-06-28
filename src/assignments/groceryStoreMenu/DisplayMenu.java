package assignments.groceryStoreMenu;

import static assignments.groceryStoreMenu.StoreMenu.*;

public class DisplayMenu {

	static public void displayMenu() {
		System.out.println("---Menu Items---");
		for (int i = 0; i < itemCodes.length; i++) {
			System.out.println(itemCodes[i] + " - " + itemNames[i] + " - " + itemPrices[i] + " $ ");
		}
		System.out.println("-----------------");
	}

}
