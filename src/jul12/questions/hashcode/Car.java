package jul12.questions.hashcode;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@ToString

public class Car {
	private String brandName;
	private String modelName;
	private int year;
	private double price;

	@Override
	public int hashCode() {
		return Objects.hash(brandName, modelName, year, price);
	}
}
