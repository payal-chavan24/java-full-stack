import java.util.Scanner;

public class HcfLcm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");// 4//2//1
		int a = sc.nextInt();
		System.out.println("enter b value");// 8//4//2
		int b = sc.nextInt();

		int div = 2;
		int hcf = 1;
		while (a >= div && b >= div) {
			if (a % div == 0 & b % div == 0) {
				a = a / div;
				b = b / div;
				hcf = hcf * div;// 2*2

			} else {
				div++;
			}

		}
		int lcm = hcf * a * b;
		System.out.println("hcf" + hcf);
		System.out.println("lcm" + lcm);
		sc.close();

	}
}
