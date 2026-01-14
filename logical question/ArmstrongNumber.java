import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check is it armstrong number or not");
		int num = sc.nextInt();
		int count = 0;
		int total = 0;
		int num2 = num;
		int num3 = num;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);
		while (num2 > 0) {
			int digit = num2 % 10;
			int i = 1;
			int power = 1;
			while (i <= count) {
				power = power * digit;
				i++;
			}
			total = total + power;
			num2 = num2 / 10;

		}
		if (num3 == total) {
			System.out.println(num3 + " it is armstrong number");
		} else {
			System.out.println(num3 + " it is not armstrong number");
		}
		sc.close();

	}
}
