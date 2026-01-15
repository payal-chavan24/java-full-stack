
import java.util.Scanner;

public class IdentifyChar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//	
		System.out.println("enter a charchter");
		char ch = sc.next().charAt(0);
		if (ch > 'A' && ch <= 'Z') {
			System.out.println(ch +" is a Uppercase letter");
		} else if (ch > 'a' && ch <= 'z') {
			System.out.println(ch +" is a lowercase letter");
		} else if (ch > '0' && ch <= '9') {
			System.out.println( ch +" is a Digit");
		} else {
			System.out.println(ch +" is a Special charcter");
		}
		sc.close();
	}
}
