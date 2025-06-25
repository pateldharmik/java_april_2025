package assignments.groceryStoreMenu;

import static assignments.groceryStoreMenu.StoreMenu.*;

public class AddItem {

	static public void addItem(String name, double price) throws InsufficienetBalanceException {
		double newTotal = currentTotal + price;
		if (newTotal > balance) {
			throw new InsufficienetBalanceException("Insufficient Balance Exception", currentTotal, name, price, balance);
		}

		if (cartCount < cart.length) {
			currentTotal = newTotal;
			cart[cartCount] = name;
			cartCount++;
		} else {
			System.out.println("Can not add more items. Item list is full.");
		}
	}

}
