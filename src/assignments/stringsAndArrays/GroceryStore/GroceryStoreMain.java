package assignments.stringsAndArrays.GroceryStore;

import java.util.Scanner;

public class GroceryStoreMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] fruits = {"Mango","Strawberry","Grapes","Jamun","Orange"};
		int[] price = {14,4,6,8,5};

		GroceryStore gs = new GroceryStore(fruits, price);

		gs.showPrice();

		System.out.println("Enter fruit: ");
		String fruit = sc.next();

		System.out.println("Enter weight in kgs: ");
		int weight = sc.nextInt();

		gs.purchase(fruit, weight);
	}
}
