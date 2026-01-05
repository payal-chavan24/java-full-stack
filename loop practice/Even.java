//Print all even numbers between 1 to 200 using for loop.
public class Even {
	public static void main(String[] args) {
		// for loop
		System.out.println("for loop");
		for (int i = 1; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		// while loop
		System.out.println("while loop");
		int j = 1;
		while (j <= 200) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}
		// do-while loop
		System.out.println("do-while loop");
		int k = 1;
		do {
			if (k % 2 == 0) {
				System.out.println(k);
			}
			k++;
		} while (k <= 200);

	}
}
