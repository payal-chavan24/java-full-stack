

import java.util.Scanner;
//Accept three sides of a triangle and check whether it is valid or not (sum of any two sides > third side).

public class Triangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("enter c value");
		int c = sc.nextInt();
		if (a + b > c && b + c > a && a + c > b) {
		System.out.println("valid triangle");	
		}else {
			System.out.println("invalid triangle");
		}
		sc.close();
	}
}
