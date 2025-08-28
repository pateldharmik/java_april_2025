package assignments.stringsAndArrays.ProductInventoryManagementSystem;

import java.util.Scanner;

public class ProductInventoryManagementMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] product = {"iPhone", "iPad", "MacBook", "AirPods", "iWatch"};
		double[] price = {1200, 1000, 1500, 300, 500};

		ProductInventoryManagement pim = new ProductInventoryManagement(product, price);
		pim.displayData();

		System.out.println("Enter the product name you would like to search: ");
		String name = sc.nextLine();

		pim.searchProduct(name);
	}
}
