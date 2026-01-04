//Print the table of 5 using a loop.
public class Table1 {
	public static void main(String[] args) {
		// for loop
		System.out.println("for loop");
		for (int i = 1; i <= 10; i++) {
			System.out.println(5 * i);
		}
		// while loop
		System.out.println("while loop");
		int j = 1;
		while (j <= 10) {
			System.out.println(5 * j);
			++j;// same as j++
		}
		// do-while loop
		System.out.println("do-while loop");
		int k = 1;
		do {
			System.out.println(5 * k);
			k++;
		} while (k <= 10);
	}

}
