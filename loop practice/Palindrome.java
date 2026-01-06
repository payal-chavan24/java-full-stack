//Accept a number and print whether it is a palindrome or not using while loop.
public class Palindrome {
	public static void main(String[] args) {
		int num = 121;
		int temp = 121;
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;// 1
			rev = rev * 10 + digit;// 1
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not  palindrome");
		}

	}

}
