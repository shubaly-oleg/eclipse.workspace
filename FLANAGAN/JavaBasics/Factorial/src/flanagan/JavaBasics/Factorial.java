package flanagan.JavaBasics;

public class Factorial {
	public static int factorial(int x) throws IllegalAccessException {
		if (x < 0) throw new IllegalAccessException("x must be > 0");
		int fact = 1;
		for (int i = 2; i <= x; i++) {
//			System.out.println(i);
//			System.out.println(fact);
			fact = fact * i;
		}
		return fact;
	}
}