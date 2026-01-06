//Print Fibonacci series up to 10 terms using for loop.
public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <= 8; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}

	}

}
