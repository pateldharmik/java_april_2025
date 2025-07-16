package jul12.questions.hashcode;

import java.util.Objects;

public class Car {
	private String brandName;
	private String modelName;
	private int year;
	private double price;

	public Car(String brandName, String modelName, double price, int year) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brandName='" + brandName + '\'' +
				", modelName='" + modelName + '\'' +
				", year=" + year +
				", price=" + price +
				'}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandName, modelName, year, price);
	}
}
