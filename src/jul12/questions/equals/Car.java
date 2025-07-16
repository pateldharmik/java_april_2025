package jul12.questions.equals;

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
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return year == car.year && Double.compare(price, car.price) == 0 && Objects.equals(brandName, car.brandName) && Objects.equals(modelName, car.modelName);
	}

}
