//basic calculator operations library
public class Operations {
	//takes two inputs, a and b, and adds them.
	public static float add (float a, float b) {
		return a + b;
	}
		
	//takes two inputs, a and b, and subtracts them.
	public static float subtract (float a, float b) {
		return a - b;
	}
		
	//takes two inputs, a and b, and multiplies them
	public static float multiply (float a, float b) {
		return a * b;
	}
		
	//takes two inputs, a and b, and divides them
	public static float divide (float a, float b) {
		return a / b;
	}
		
	//takes two inputs, a and b, and modulo's them
	public static float modulo (float a, float b) {
		return a % b;
	}
		
	//takes two inputs, a and b, and performs a^b function
	public static float power (float a, float b) {
		return (float) Math.pow(a, b);
	}

	//takes one input, a, and performs the factorial operation recursively
	public static float factorial (float a) {
		if (a <= 2) {
			return a; 
		}
		return a * factorial(a - 1);
	}
	
	//takes one input, a, and performs the sin operation
	public static double sine (float a) {
		return Math.sin(a);
	}
	
	//takes one input, a, and performs the cos operation
	public static double cosine (float a) {
		return Math.cos(a);
	}
	
	//takes one input, a, and performs the tan operation
	public static double tangent (float a) {
		return Math.tan(a);
	}
	
	public static float absolute (float a) {
		if (a < 0) {
			return a * -1;
		}
		return a;
	}
}
