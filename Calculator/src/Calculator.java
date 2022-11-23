import java.util.ArrayList;
import java.util.Scanner;

//name: Basic Calculator
//a quick toy to perform simple operations with one or two inputs
//Author: Brandon Jameson
//Github: https://github.com/JamesonGG/Basic-Calculator
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
		
		switch (op) {
		
		case '+':
			return Operations.add(valueA, valueB);
		case '-':
			return Operations.subtract(valueA, valueB);
		case '*':
			return Operations.multiply(valueA, valueB);
		case '/':
			return Operations.divide(valueA, valueB);
		case '%':
			return Operations.modulo(valueA, valueB);
		case '^':
			return Operations.power(valueA, valueB);
		case '!':
			return Operations.factorial(valueA);
		case 's':
			return (float) Operations.sine(valueA);
		case 'c':
			return (float) Operations.cosine(valueA);
		case 't':
			return (float) Operations.tangent(valueA);
		case '|':
			return Operations.absolute(valueA);
		}
		System.out.println("ERROR: Unknown operator.");
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
