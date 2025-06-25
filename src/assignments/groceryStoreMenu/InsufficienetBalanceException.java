package assignments.groceryStoreMenu;

public class InsufficienetBalanceException extends Exception {

	double currentTotal;
	double itemPrice;
	double maxBalance;
	String itemName;

	public InsufficienetBalanceException(String message, double currentTotal, String itemName, double itemPrice, double maxBalance) {
		super(message);
		this.currentTotal = currentTotal;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.maxBalance = maxBalance;
	}

	public double getCurrentTotal() {
		return currentTotal;
	}

	public String getItemName() {
		return itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public double getMaxBalance() {
		return maxBalance;
	}
}
