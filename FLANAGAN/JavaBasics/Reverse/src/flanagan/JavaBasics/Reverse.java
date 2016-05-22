package flanagan.JavaBasics;

public class Reverse {

	public static void main(String[] args) {
		// print cmdLine args string in reverse order
		for (int i = args.length-1; i >= 0 ; i--) {
			for (int j = args[i].length()-1; j >=0; j--) {
				System.out.print(args[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
