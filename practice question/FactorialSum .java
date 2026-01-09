public class FactorialSum {
public static void main(String args[]) {
//	print the sum of factorial series
	int fact=1;
	int sum=0;
	for(int i=1;i<=5;i++) {
	fact=fact*i;	//1,2,6
	sum=sum+fact;//1
	System.out.print(sum+" ");
	}
	}
}
