//Print the sum of first 10 natural numbers.

public class NaturalNumber {

	public static void main(String[] args) {
		// for loop
		System.out.println("for loop");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		// while loop
		System.out.println("while loop");
		int sum1 = 0;
		int j = 1;
		while (j <= 10) {
			sum1 = sum1 + j;
			j++;
		}
		System.out.println(sum1);
		// do-while loop
		System.out.println("do-while loop");
		int sum2 = 0;
		int k = 1;
		do {
			sum2 = sum2 + k;
			k++;
		} while (k <= 10);
		System.out.println(sum2);

	}

}
