//write a java program to print all factors of a given number
public class Factors {
	public static void main(String[] args) {
		int num = 12;
		for (int i = 1; i <= 12; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}

		}
		// write a java program to print the sum of all even digit from given number
		// using for loop
		int digit = 0;
		int num1 = 123456;
		int sum = 0;
		for (int i = num1; i > 0; i = i / 10) {
			digit = i % 10;
			if (digit % 2 == 0) {
				sum = sum + digit;
			}

		}
		System.out.println(sum);
		// write a java program to print the sum of all even digit from given number
		// using while loop
		int num2 = 45689;
		int digit1 = 0;
		int sum1 = 0;
		while (num2 > 0) {
			digit1 = num2 % 10;
			if (digit1 % 2 == 0) {
				sum1 = sum1 + digit1;
			}
			num2 = num2 / 10;
		}
		System.out.println(sum1);

	}

}
