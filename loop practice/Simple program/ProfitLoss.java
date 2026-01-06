//write a program to accept selling price and cost price and find loss or profit
public class ProfitLoss {
	public static void main(String[] args) {
		int sp = 34000;
		int cp = 30000;
		if (sp > cp) {
			int profit = sp - cp;
			System.out.println("profit=" + profit);
		} else if (sp < cp) {
			int loss = cp - sp;
			System.out.println("loss=" + loss);
		} else {
			System.out.println("no loss no profit");
		}

	}
}
