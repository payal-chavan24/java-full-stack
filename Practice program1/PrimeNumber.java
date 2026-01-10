//print 1 to 100 prime number
public class PrimeNumber {
	public static void main(String args[]) {
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;

				}
			}
			if (count == 2) {
				System.out.print(i + " ");

			}

		}
		System.out.println();
		// check whether 10 is prime number or not ,here we are checking only one number
		int num = 10;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;

			}

		}
		if (count == 2) {
			System.out.print(num + " it is prime number");

		} else {
			System.out.print(num + " it is not prime number");
		}

	}
}
