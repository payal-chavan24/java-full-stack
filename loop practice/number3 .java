//Print all numbers from 1 to 100 using for, while, and do-while loops.
public class number3 {
	public static void main(String[] args) {
		// for loop
		System.out.println("for loop");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		// while loop
		System.out.println("while  loop");
		int j = 1;
		while (j <= 100) {
			System.out.println(j);
			j++;
		}
		// do-while loop
		System.out.println("do-while loop");
		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k <= 100);
	}

}
