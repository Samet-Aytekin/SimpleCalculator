package simpleCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
	private int election;
	Scanner input = new Scanner(System.in);

	public void calculator() {
		listOperations();
		if (election == 1) {
			simpleCalculator();
		} else if (election == 2) {
			scientificCalculator();
		} else {
			System.out.println("invalid input please choose 1 or 2 !");
			calculator();
		}
	}

	public void simpleCalculator() {
		SimpleOperationCalculator calculator = new SimpleOperationCalculator();
		double num1, num2;
		System.out.println("welcome to simple calculator \n"
				+ "1 --> for adding operation \n2 --> for substract operation \n3 --> for multiplying operation \n4 --> for dividing operation ");
		election = input.nextInt();
		switch (election) {
		case 1: {
			System.out.println("enter the numbers you want to add\n" + "number 1 : , number 2 : ");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.println("result : " + calculator.add(num1, num2));
			break;
		}
		case 2: {
			System.out.println("enter the numbers you want to substarct \n" + "number 1 : , number 2 : ");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.println("result : " + calculator.substract(num1, num2));
			break;
		}
		case 3: {
			System.out.println("enter the numbers you want to multiply\n" + "number 1 : , number 2 : ");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.println("result : " + calculator.multiply(num1, num2));
			break;
		}
		case 4: {
			System.out.println("enter the numbers you want to divide\n" + "number 1 : , number 2 : ");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.println("result : " + calculator.divide(num1, num2));
			break;
		}
		default:
			System.out.println("invalid input !");
		}
	}

	public void scientificCalculator() {
		ScientificCalculator calculator = new ScientificCalculator();
		double num1, num2;
		System.out.println("welcome to scientific calculator \n"
				+ "1 --> for sine operation \n2 --> for cosine operation \n3 --> for square root operation \n4 --> for exponent operation ");
		election = input.nextInt();
		switch (election) {
		case 1: {
			System.out.println("enter the angle you want to use\n"+ "angle : ");
			num1 = input.nextDouble();
			System.out.println("result : " + calculator.sin(num1));
			break;
		}
		case 2: {
			System.out.println("enter the angle you want to use\n" + "angle : ");
			num1 = input.nextDouble();
			System.out.println("result : " + calculator.cos(num1));
			break;
		}
		case 3: {
			System.out.println("enter the number you want the square root of\n"+ "number : ");
			num1 = input.nextDouble();
			System.out.println("result : " + calculator.sqrt(num1));
			break;
		}
		case 4: {
			System.out.println("enter the number you want to get the exponent\n"+ "base : , exponent : ");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.println("result : " + calculator.pow(num1, num2));
			break;
		}
		default:
			System.out.println("invalid input !");
		}

	}

	private List<String> listOperations() {

		List<String> operations = new ArrayList<>();
		operations.add("1. Add (+)");
		operations.add("2. Substract (-)");
		operations.add("3. Multiply (*)");
		operations.add("4. Divide (/)");
		operations.add("5. Square Root (sqrt)");
		operations.add("6. Exponential (pow)");
		operations.add("7. Sinus (sin)");
		operations.add("8. Cosine (cos)");

		System.out.println("Calculator Operations:");
		for (String operation : operations) {
			System.out.println(operation);
		}

		System.out.println("\n*** Simple calculator contains operations from 1 to 4. ***\n"
				+ "*** Scientific calculator contains operations from 5 to 8.***\n" + "\n1 --> for simple calculator \n"
				+ "2 --> for scientific calculator\n" + "\nMake your decision ! ");
		election = input.nextInt();
		return operations;
	}
}
