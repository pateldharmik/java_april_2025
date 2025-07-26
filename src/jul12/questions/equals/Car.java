package jul12.questions.equals;

import lombok.AllArgsConstructor;
import java.util.Objects;

@AllArgsConstructor
public class Car {
	private String brandName;
	private String modelName;
	private int year;
	private double price;

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return year == car.year && Double.compare(price, car.price) == 0 && Objects.equals(brandName, car.brandName) && Objects.equals(modelName, car.modelName);
	}

}
