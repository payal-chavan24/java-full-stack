//Write a java program to print factorial series 
public class Factorialseries {
	public static void main(String[] args) {
		int fact = 1;
		for (int i = 1; i <= 10; i++) {
			fact = fact * i;
			System.out.print(fact + " ");
		}
		System.out.println();
//Write a java program to print sum of factorial series
		int sum = 1;
		int add = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum * i;
			add = add + sum;
			//System.out.print(add + " ");// if we want to print all running value then we write inside loop
		}
		System.out.println(add + " ");//if we want to print final answer
	}

}
