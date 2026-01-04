//Print the table of any number (e.g., n = 7).
public class Table2 {
	public static void main(String[] args) {//
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
			System.out.println(k * 7);
			k++;
		} while (k <= 10);

	}

}
