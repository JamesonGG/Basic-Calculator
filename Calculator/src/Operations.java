//basic calculator operations library
public class Operations {
	
	public static float add (float a, float b) {
		return a + b;
	}
	
	public static float subtract (float a, float b) {
		return a - b;
	}
		
	public static float multiply (float a, float b) {
		return a * b;
	}
		
	public static float divide (float a, float b) {
		if (b == 0) {
			System.out.println("ERROR: Undefined output.");
		}
		return a / b;
	}
		
	public static float modulo (float a, float b) {
		return a % b;
	}
		
	public static float power (float a, float b) {
		float foo = 0;
		if (b == 0) {
			return 1;
		}
		else {
			if (b > 0) {
				foo = a * power(a, b - 1);
				if (a % 2 != 0 && a < 0) { //if odd and negative, make foo negative
					foo *= -1;
				}
			}
			if (b < 0) {
				foo = 1 / (power(a, -b));
			}
		}
		return foo;
	}

	public static float factorial (float a) {
		if (a <= 2) {
			return a; 
		}
		return a * factorial(a - 1);
	}
	
	public static double sine (float a) {
		return Math.sin(a);
	}
	
	public static double cosine (float a) {
		return Math.cos(a);
	}
	
	public static double tangent (float a) {
		return Math.tan(a);
	}
	
	public static float absolute (float a) {
		if (a < 0) {
			return a * -1;
		}
		return a;
	}
	
	public static float imperialConversion (float a) {
		return (float)(a / 2.54);
	}
	
	public static float decimalConversion (float a) {
		return (float)(a * 2.54);
	}
}
