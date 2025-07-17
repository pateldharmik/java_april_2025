package jul16;

public class VehicleValidate {

	public void validatePlate(int plate, IChecker i) {

		if (i.check(plate)) {
			System.out.println("Plate Number: " + plate + " is valid to drive.");
		} else {
			System.out.println("Plate Number: " + plate + " is not valid to drive.");
		}
	}
}
