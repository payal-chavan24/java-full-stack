import java.util.Scanner;

public class Count{
//accept 10 number and find how many positive ,negative ,zero
	public static void main(String[] args) {
		//we want  take input from user so need to use scanner class 
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 10 number :");
//		int pos = 0;
//		int neg = 0;
//		int zero = 0;
//
//		for (int i = 1; i <= 10; i++) {
//			int n = sc.nextInt();
//			if (n > 0) {
//				pos++;
//			} else if (n < 0) {
//				neg++;
//
//			} else {
//				zero++;
//			}
//		}
//		System.out.println("positive number are=" + pos);
//		System.out.println("negative number are=" + neg);
//		System.out.println("zero number are=" + zero);
//		sc.close();
	//	accept 10 number and find largest and smallest 
		System.out.println("enter number 1:");
		int num = sc.nextInt();
		int smallest = num;
		int largest = num;
		System.out.println("enter number 9");
		for (int i = 2; i <= 10; i++) {
			// System.out.println("enter number 9");
			num = sc.nextInt();
			if (num < smallest) {
				smallest = num;
			}
			if (num > largest) {
				largest = num;
			}

		}
		System.out.println("smallest=" + smallest);
		System.out.println("largest=" + largest);
        sc.close();
	}

}
