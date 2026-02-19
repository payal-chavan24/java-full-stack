//import java.util.Scanner;

public class Practice2 {
public static void main(String args[]) {
	//Scanner sc=new Scanner(Systeam.in);

//	// 1 to 10 table
//	for(int i=1;i<=10;i++) {
//		for(int j=1;j<=10;j++) {
//			System.out.println(i+"X"+j+"="+(i*j));
//		}
//		System.out.println(" ");
//	}
//	//power of number
//	int a=3;
//	int b=5;
//	int result=1;
//	for(int i=1;i<=5;i++) {
//		result=result*a;
//	}
//	System.out.println(result);
//	
	//2 4 6 8...
//	for(int i=1;i<=10;i++) {
//		System.out.print(i+i+" ");
//	}
//	System.out.println();
//	for(int i=1;i<=10;i++) {
//		if(i%2==0) {
//			System.out.print(i+" ");
//		}
//	}
//	System.out.println(" ");
//	for(int i=2;i<=10;i+=2) {
//		System.out.print(i+" ");
//	}
	
	//1 -2 3 -4...
//	for(int i=1;i<=10;i++) {
//		if(i%2==0) {
//			System.out.print(-i+" ");
//		}else {
//			System.out.print(i+" ");
//		}
//		
//	}
//	int n=1;
//	for(int i=n;i<=5;i++) {
//		System.out.println(n);
//		n=n*10;
//		
//	}
	//print factorial series
//int fact=1;
//	for(int i=1;i<=8;i++) {
//	fact=fact*i;
//	System.out.print(fact+", ");
//	}
//	print the sum of factorial series
	int fact=1;
	int sum=0;
	for(int i=1;i<=5;i++) {
	fact=fact*i;	//1,2,6
	sum=sum+fact;//1
	System.out.print(sum+" ");
	}
	
//	int temp=1;
//	for(int i=1;i<=4;i++) {
//		for(int j=1;j<=4;j++) {
//			//System.out.println("*");
//		//System.out.print(i+"");
//			
//			System.out.print(temp+" ");
//			temp++;
//		}
//		System.out.println(" ");
//	}
//	
	
//	for(int i=1;i<=4;i++) {
//	for(int j=1;j<=i;j++) {
//		System.out.print("*"+" ");
//	}
//	System.out.println("");
//
//	}
	
//	for(int i=4;i>=1;i--) {
//	for(int j=1;j<=i;j++) {
//		System.out.print("*"+"");
//	}
//	System.out.println("");
//	}
//		
			
//	for(int i=1;i<=3;i++) {
//		int value=65;
//		for( int j=1;j<=3;j++) {
//			System.out.print((char)value);
//			value++;
//		}
//		System.out.println();
//	}
//	for(int i=1;i<=3;i++) {
//	for(int j=1;j<=5;j++) {
//		if(i==1||i==3) {
//			System.out.print("* ");
//		}else{
//			System.out.print("# ");
//		}
//	
//	}	
//	System.out.println("");
//	}
	}
}
