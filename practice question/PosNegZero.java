import java.util.Scanner;

public class PosNegZero {
//accept 10 number and find how many positive ,negative ,zero
	public static void main(String[] args) {
		//we want  take input from user so need to use scanner class 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 number :");
		int pos = 0;
		int neg = 0;
		int zero = 0;

		for (int i = 1; i <= 10; i++) {
			int n = sc.nextInt();
			if (n > 0) {
				pos++;
			} else if (n < 0) {
				neg++;

			} else {
				zero++;
			}
		}
		System.out.println("positive number are=" + pos);
		System.out.println("negative number are=" + neg);
		System.out.println("zero number are=" + zero);
		sc.close();
