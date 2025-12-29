package loops; //print the sum of even numbers from 1 to 100

public class OddNumber2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
			// System.out.println("sum of even number= "+sum);
		}
		System.out.println("sum of odd number= " + sum);
	}
}
