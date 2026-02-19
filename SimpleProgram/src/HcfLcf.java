public class HcfLcf{
	public static void main(String args[]) {
		int a=24;//12,6,2
		int b=12;//6,3,1
		//int c=a;
		//int d=b;
		int hcf=1;
		int div=2;
		while(a>=div&&b>=div) {
			if(a%div==0&&b%div==0) {
			a=a/div;
			b=b/div;
				hcf=hcf*div;//2*2*3
			}else {
				div++;
			}	
		}
		int lcf=hcf*a*b;
		System.out.println("hcf ="+hcf);
		System.out.println("lcf ="+lcf);
	}
}