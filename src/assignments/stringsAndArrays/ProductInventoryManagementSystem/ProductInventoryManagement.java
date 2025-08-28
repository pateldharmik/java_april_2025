package assignments.stringsAndArrays.ProductInventoryManagementSystem;

public class ProductInventoryManagement {
//	Product Inventory Management
//	You are managing an inventory system for an online store.
//	Create a Java program that uses an array to store the names of 5 products and another array to store their corresponding prices.
//	Write a function that: • Displays all products with their prices.
//	• Allows the user to search for a product by name and retrieve its price.

	String[] products = new String[5];
	double[] price = new double[5];

	public ProductInventoryManagement(String[] products, double[] price) {
		this.price = price;
		this.products = products;
	}

	public void displayData() {
		for (int i = 0; i < products.length; i++) {
			System.out.println("Product Name: " + products[i] + " and price is: " + price[i] + "$");
		}
	}

	public void searchProduct(String productName) {
		for (int i = 0; i < products.length; i++) {
			if (products[i].equalsIgnoreCase(productName)) {
				double purchasePrice = price[i] + (price[i] * .13);
				System.out.println("Product Name: " + products[i] + " and price is: " + price[i] + "$" + " + 13% tax totalling: " + purchasePrice + "$");
			}
		}
	}
}
