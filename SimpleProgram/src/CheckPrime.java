//print 10 to 15 prime number and add them
public class CheckPrime {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 10; i <= 15; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("Sum of prime number =" + sum);

	}
}