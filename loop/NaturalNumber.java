package loops; //Print the sum of first 10 natural numbers.

public class NaturalNumber {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			//System.out.println(sum);// prints sum after each addition
		}

		 System.out.println(sum); // prints final result only once
	}

}
