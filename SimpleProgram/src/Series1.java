//Generate the series 2 4 6 8..20
public class Series1 {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
		System.out.print(i+i+" ");	
		}
		System.out.println();
		//second way to solve this question
		for(int i=1;i<=10;i++) {
			System.out.print(2*i+" ");
		}
		System.out.println();
		//third way to solve this question 
		for(int i=1;i<=20;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
			
		}
	}

}
