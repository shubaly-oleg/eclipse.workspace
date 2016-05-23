package flanagan.JavaBasics;

public class FizzBuzz2 {

	public static void main(String[] args) {
		// FizzBuzz with switch op.
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			switch (i) {
			case 5: case 10: case 15: case 20: case 25: case 30:
			case 40: case 45: case 50: case 55: case 60: case 65:
			case 75: case 80: case 85: case 90: case 95:
				System.out.println(" Fizz");
				break;
			case 7: case 14: case 28: case 42: case 49: case 56:
			case 63: case 77: case 84: case 91: case 98:
				System.out.println(" Buzz");
				break;
			case 35: case 70:
				System.out.println(" FizzBuzz");
				break;
			default:
				System.out.println();
				break;
			}
		}
	}
}
