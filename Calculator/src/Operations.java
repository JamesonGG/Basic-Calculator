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
	
	//really tried to avoid Math here, turns out that decimal
	//power thing is a whole potential project in of itself, maybe
	//I'll do something like it in C someday.
	public static float power (float a, float b) {
		float val = (float) (b * Math.log(a));
	    return (float)Math.exp(val);
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
