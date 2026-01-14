import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		System.out.println("Fibonacci Series");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		sc.close();

	}
}
