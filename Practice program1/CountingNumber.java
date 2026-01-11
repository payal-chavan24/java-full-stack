//write a java program to accept 10 numbers and count how many are positive ,negative,zero
import java.util.Scanner;
public class CountingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 number");
		int positive=0;
		int negative=0;
		int zero=0;
		for(int i=1;i<=10;i++) {
			int n =sc.nextInt();
			if(n>0) {
				positive++;
			}else if(n<0) {
				negative++;	
			}else {
				zero++;
			}
				
		}
		System.out.println("Positive number in total are="+positive);
		System.out.println("Negative number in total are="+negative);
		System.out.println("Zero number in total are="+zero);
		sc.close();

}
}
