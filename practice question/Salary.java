
//Accept a person's salary and apply tax:
import java.util.Scanner;

public class Salary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		int sal = sc.nextInt();
		if (sal < 50000) {
			System.out.println("no tax");

		} else if (sal <= 100000) {
			System.out.println("10% tax");
		} else {
			System.out.println("20% of tax");
		}
		sc.close();
	}
}
