package simpleCalculator;

public class SimpleOperationCalculator implements ISimpleOperationCalculator {

	@Override
	public double add(double num1, double num2) {

		return num1 + num2;
	}

	@Override
	public double substract(double num1, double num2) {

		return num1 - num2;
	}

	@Override
	public double multiply(double num1, double num2) {

		return num1 * num2;
	}

	@Override
	public double divide(double num1, double num2) {
		if (num2 == 0) {
				throw new IllegalArgumentException("you cannot divide by 0");
		}
		return num1 / num2;
	}

}
