package simpleCalculator;

public class ScientificCalculator implements IScientificCalculator {

	@Override
	public double sin(double angle) {
		double angleInRadians = Math.toRadians(angle);
		double sinValue = Math.sin(angleInRadians);
		return sinValue;
	}

	@Override
	public double cos(double angle) {
		double angleInRadians = Math.toRadians(angle);
		double cosValue = Math.cos(angleInRadians);
		return cosValue;
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
