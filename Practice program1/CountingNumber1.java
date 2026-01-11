// accept 10 number and find largest and smallest
import java.util.Scanner;
public class CountingNumber1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		int num=sc.nextInt();
		System.out.println("enter 10 number");
		int smallest=num;
		int largest=num;
		for(int i=1;i<=10;i++) {
			num= sc.nextInt();
			if(num<smallest) {
				smallest=num;
			}
			if(num>largest) {
				largest=num;
			}
		
		}
		System.out.println("smallest number are ="+smallest);
		System.out.println("largest number are ="+largest);
		sc.close();
	}
}
