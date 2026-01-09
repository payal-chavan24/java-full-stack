import java.util.Scanner;
public class LargestSmallest {
public static void main(String[] args) {
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
