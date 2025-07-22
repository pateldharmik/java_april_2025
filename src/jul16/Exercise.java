package jul16;

public class Exercise {

	//Make a functional interface(IChecker) to check an integer is even or not.
	//If it is even, return true, else return false.
	//Then make class (VehicleValidate) and method (ValidatePlate) which will accept IChecker and license plate number(int)
	//In implementation call check() to determine whether vehicle is allowed to drive or not.
	//From main() call to validatePlate and print result.
	//Use Lambda.
	public static void main(String[] args) {

		int plateNumber = 1234;
		int plateNumber2 = 1235;

		VehicleValidate vv = new VehicleValidate();

		IChecker iCheck = (Number) -> Number % 2 == 0;

		vv.validatePlate(plateNumber, iCheck);
		vv.validatePlate(plateNumber2, iCheck);


	}
}
