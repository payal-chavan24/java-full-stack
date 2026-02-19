
public class ArmstrongNumber {

	public static void main(String[] args) {
//		int num = 153;
//		int total = 0;
//		int n1 = num;
//		int n2 = num;
//		int count = 0;
//		while (n1 > 0) {
//			count++;
//			n1 = n1 / 10;
//		}
//		System.out.println(count);
//		while (n2 > 0) {
//			int digit = n2 % 10;
//			int sum = 1;
//			int i = 1;
//			while (i <= count) {
//				sum = sum * digit;
//				i++;
//			}
//			total = total + sum;
//			n2 = n2 / 10;
//
//		}
//		System.out.println(total);
//		if (total == num) {
//			System.out.println("it is an armstrong number");
//		} else {
//			System.out.println("it is not armstrong number");
//		}

		int num = 1533;
		int a = num;
		int arm = 0;
		while (num > 0) {
			int rem = num % 10;
			arm = (rem * rem * rem) + arm;
			num = num / 10;

		}
		if (arm == a) {
			System.out.println(a + "is armstrong number");
		} else {
			System.out.println("It is not");
		}

	}
}
