package assignments.stringsAndArrays.GroceryStore;

import java.util.Scanner;

public class GroceryStore {
//	Grocery Store Price Calculator
//	You are working at a grocery store that offers 5 different fruits.
//	Create a Java program that:
//	• Uses two arrays: one for storing the names of fruits and another for storing their prices per kilogram.
//	• Allows the user to input the fruit name and the number of kilograms they want to purchase,
//	then calculates and prints the total price.

	String[] fruits = new String[5];
	int[] price = new int[5];

	public GroceryStore(String[] fruit, int[] price) {
		this.fruits = fruit;
		this.price = price;
	}

	public void showPrice(){
		for(int i = 0; i < 5; i++){
			System.out.println(fruits[i]+" ===> "+price[i]);
		}
	}

	public void purchase(String fruit, int weight) {
		int totalPrice = 0;
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equalsIgnoreCase(fruit)) {
				totalPrice = price[i] * weight;
			}
		}
		System.out.println("Total price for " + weight + "kg of " + fruit + " is " + totalPrice);
	}
}
