import java.util.Scanner;

public class PrimeNumber1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check weather it is Prime number or not");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + " it is prime number");
		} else {
			System.out.println(num + " it is not prime number");
		}
		sc.close();

	}
}
