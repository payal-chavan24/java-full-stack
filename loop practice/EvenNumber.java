//Print all even numbers between 1 and 50.
public class EvenNumber {
 public static void main (String args[]) {
	 //for loop
	 System.out.println("for loop");
	for(int i=1;i<=50;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	//while loop
	System.out.println("while loop");
	int i=1;
	while(i<=50) {
		if(i%2==0) {
			System.out.println(i);
		}
		i++;
	}
	//do-while loop
	System.out.println("do while loop");
	int j=1;
	do{
	if(j%2==0) {
		System.out.println(j);
	}j++;
	}while(j<=50);
 }
 }

	
	
