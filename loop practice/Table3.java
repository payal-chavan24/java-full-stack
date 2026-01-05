//Print the multiplication table of any number (example: 7) using all three loops.
public class Table3 {
	public static void main(String[] args) {
		// for loop
		System.out.println("for loop");
		for (int i = 1; i <= 10; i++) {
			System.out.println(7 * i);
		}
		// while loop
		System.out.println("while loop");
		int j = 1;
		while (j <= 10) {
			System.out.println(7 * j);
			j++;
		}
		// do-while loop
		System.out.println("do-while loop");
		int k = 1;
		do {
			System.out.println(7 * k);
			k++;
		} while (k <= 10);

	}

}
