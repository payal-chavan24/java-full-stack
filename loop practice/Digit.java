//Print the sum of digits of a number using while loop.
public class Digit {
	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		while (num > 0) {// condition false at n=0
			int digit = num % 10;// 4//3//2//1
			sum = sum + digit;// 0+4=4//4+3=7//7+2=9//9+1=10
			num = num / 10;// 1234/10=123//12//1//
		}
		System.out.println(sum);
	}

}
