//Count how many digits are in a number (e.g., 48793 â†’ 5 digits) using while loop.
public class Count {
	public static void main(String[] args) {
		int digit = 0;
		int num = 48793;
		while (num > 0) {
			digit++;
			num = num / 10;
		}
		System.out.println(digit);
	}

}
