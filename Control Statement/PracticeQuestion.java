import java.util.Scanner;

public class PracticeQuestion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if (num % 5 == 0 && num % 11 == 0) {
			System.out.println(num + " is multiply by 5 and 11");
		} else {
			System.out.println(num + " is not multiply by 5 and 11 ");
		}
		sc.close();

	}
}
