//Print numbers from 1 to 10 using a loop.
//for loop
public class Number1 {

	public static void main(String[] args) {
		System.out.println("for loop");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
//while loop
		System.out.println("while loop");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
//do-while loop
		System.out.println("do while loop");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
	}

}
