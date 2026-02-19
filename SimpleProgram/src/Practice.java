//converts hours into min and sec
public class Practice {

	public static void main(String[] args) {
//		int hours=2;
//		int min=hours*60;
//		int sec=3600*hours;
//		System.out.println(min);
//		System.out.println(sec);

//		int day=555;
//		int year=day/365;
//		int  remaining=day%365;
//		int weekend=remaining/7;
//		int days=remaining%7;
//		System.out.println(year+" year");
//		System.out.println(weekend+" weeks");
//		System.out.println(days+" days");

//		int n=44;
//		for(int i=n;i>=1;i--) {
//			System.out.print(i+" ");
//		}
//		
//		for(int i=1;i<=10;i++ ) {
//			System.out.println(i+"-"+i*i);
//		}

//		for(char ch='A';ch<='Z';ch++) {
//			System.out.print(ch+" ");
//		}

//		for(int i=0;i<=9;i++) {
//			System.out.println(i);
//		}
//		int num=12;
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//			System.out.println(i);	
//			}
//			
//		}

		int num=2485;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			if(digit%2==0) {
			sum=sum+digit;
			
			}
			 num=num/10;
			
			}
		System.out.println(sum);
//			
//		int num = 36754;
//		int sum = 0;
//		while (num > 0) {
//			int digit = num % 10;
//			if (digit % 2 != 0) {
//				sum = sum + digit;
//
//			}
//			num = num / 10;
//		}
//		System.out.println(sum);
	}

}
