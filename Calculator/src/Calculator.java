import java.util.Scanner;

//name: Basic Calculator
//a quick toy to perform simple operations with one or two inputs
//Author: Brandon Jameson
//Github: https://github.com/JamesonGG/Basic-Calculator
public class Calculator {
	static Scanner sc;
	public static float a;
	public static float b;
	public static String operation;
	public static float calculatorOutput;
	
	public static void main(String[] args) {
		calculatorOutput = result(operation, a, b);
	}

	//calculates the result from one of the Operations.
	public static float result(String operation, float a, float b) {
		float valueA = a;
		float valueB = b;
		String op = operation;
		
		switch (op) {
		
		case "add":
			return Operations.add(valueA, valueB);
		case "subtract":
			return Operations.subtract(valueA, valueB);
		case "multiply":
			return Operations.multiply(valueA, valueB);
		case "divide":
			return Operations.divide(valueA, valueB);
		case "modulo":
			return Operations.modulo(valueA, valueB);
		case "power":
			return Operations.power(valueA, valueB);
		case "factorial":
			return Operations.factorial(valueA);
		case "sine":
			return (float) Operations.sine(valueA);
		case "cosine":
			return (float) Operations.cosine(valueA);
		case "tangent":
			return (float) Operations.tangent(valueA);
		case "absolute":
			return Operations.absolute(valueA);
		case "dec2imp":
			return Operations.imperialConversion(valueA);
		case "imp2dec":
			return Operations.decimalConversion(valueA);
		}
		return 0f;
	}
}
