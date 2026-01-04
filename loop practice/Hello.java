//Print Hello 10 times.
public class Hello {
	public static void main(String[] args) {
		// for loop
		System.out.println("for loop");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello" + "---->" + i);
		}
		// while loop
		System.out.println("while loop");
		int j = 1;
		while (j <= 10) {
			System.out.println("Hello" + "---->" + j);
			j++;
		}
		// do-while loop
		System.out.println("do-while loop");
		int k = 1;
		do {
			System.out.println("Hello" + "---->" + k);
			k++;
		} while (k <= 10);

	}

}
