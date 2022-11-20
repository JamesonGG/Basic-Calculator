import java.util.Scanner;

//name: Basic Calculator v0.1
//a quick toy to perform simple operations with one or two inputs
//Author: Brandon Jameson
//Github: put in link here
public class Calculator {
	static Scanner sc;
	public static float a;
	public static float b;
	public static char operation;
	
	public static void main(String[] args) {
		Input();
		System.out.println(result(operation, a, b));
	}

	//calculates the result from one of the Operations.
	public static float result(char operation, float a, float b) {
		float valueA = a;
		float valueB = b;
		char op = operation;
		if (op == '+') {	
			return Operations.add(valueA, valueB);
		}
		if (op == '-') {	
			return Operations.subtract(valueA, valueB);
		}
		if (op == '*') {	
			return Operations.multiply(valueA, valueB);
		}
		if (op == '/') {	
			return Operations.divide(valueA, valueB);
		}
		if (op == '%') {	
			return Operations.modulo(valueA, valueB);
		}
		if (op == '^') {	
			return Operations.power(valueA, valueB);
		}
		if (op == '!') {	
			return Operations.factorial(valueA);
		}
		if (op == 's') {	
			return (float) Operations.sine(valueA);
		}
		if (op == 'c') {	
			return (float) Operations.cosine(valueA);
		}
		if (op == 't') {	
			return (float) Operations.tangent(valueA);
		}
		if (op == '|') {
			return Operations.absolute(valueA);
		}
		return 0f;
	}
	
	//takes the Input of the user.
	public static void Input() {
		sc = new Scanner(System.in);
		System.out.println("Please input your first value: ");
		a = sc.nextFloat();
		
		System.out.println("Please input your second value: ");
		System.out.println("(Note: this value may be discarded for some operations.)");
		b = sc.nextFloat();
		
		System.out.println("Please input your operation: ");
		operation = sc.next().charAt(0);
	}

}

