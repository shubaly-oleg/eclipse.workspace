
public class FizzBuzz2 {

	public static void main(String[] args) {
		// FizzBuzz with switch op.
		for (int i = 0; i < 100; i++) {
			switch (i) {
			case 35:
				System.out.println(i + " FizzBuzz");
				break;
			case 5: case 10: case 15:
			case 20: case 25: case 30:
				System.out.println(i + " Fizz");
				break;
			case 7: case 14: case 28:
				System.out.println(i + " Buzz");
				break;
			default:
				System.err.println(i);
				break;
			}
//			System.err.println();
		}
	}
}
