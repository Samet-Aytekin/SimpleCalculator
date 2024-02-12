package simpleCalculator;

public class ScientificCalculator implements IScientificCalculator {

	@Override
	public double sin(double angle) {

		return Math.sin(angle);
	}

	@Override
	public double cos(double angle) {

		return Math.cos(angle);
	}

	@Override
	public double sqrt(double number) {
		return Math.sqrt(number);
	}

	@Override
	public double pow(double base, double exponent) {
		return Math.pow(base, exponent);
	}

}
