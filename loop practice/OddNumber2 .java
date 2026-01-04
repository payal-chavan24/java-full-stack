//Print the sum of odd numbers from 1 to 100.
public class OddNumber2 {
	public static void main(String[] args) {
		// for loop
		System.out.println("for loop");
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum1 = sum1 + i;
			}
		}
		System.out.println(sum1);
		// while loop
		System.out.println("while loop");
		int sum2 = 0;
		int j = 1;
		while (j <= 100) {
			if (j % 2 == 1) {
				sum2 = sum2 + j;
			}
			j++;
		}
		System.out.println(sum2);
		// do-while loop
		System.out.println("do-while loop");
		int sum3 = 0;
		int k = 1;
		do {
			if (k % 2 == 1) {
				sum3 = sum3 + k;
			}
			k++;
		} while (k <= 100);
		System.out.println(sum3);
	}

}
