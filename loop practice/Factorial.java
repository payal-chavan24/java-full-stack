//Print factorial of any number using do-while loop.
public class Factorial {
	public static void main(String[] args) {
		// do-while loop
		System.out.println("do-while loop");
		int num = 1;
		int fact = 1;
		do {
			fact = fact * num;
			num++;
		} while (num <= 5);
		System.out.println(fact);
		// while loop
		System.out.println("while loop");
		int num1 = 1;
		int num2 = 5;
		int fact1 = 1;
		while (num1 <= num2) {
			fact1 = fact1 * num1;
			num1++;
		}
		System.out.println(fact1);
		// for loop
		System.out.println("for loop");
		int fact3 = 1;
		for (int i = 1; i <= 5; i++) {
			fact3 = fact3 * i;
		}
		System.out.println(fact);
	}

}
