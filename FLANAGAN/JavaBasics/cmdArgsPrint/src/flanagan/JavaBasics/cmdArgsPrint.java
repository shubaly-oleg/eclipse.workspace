package flanagan.JavaBasics;

public class cmdArgsPrint {

	public static void main(String[] args) {
		int i=0;
		while (i < args.length) {
			System.out.println("args[" + i + "]=" + args[i]);
			i++;
		}
	}
}
