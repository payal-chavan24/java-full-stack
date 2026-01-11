//Generate the series 1 10 100 1000 10000
public class Series {

	public static void main(String[] args) {
		int sum = 1;
		System.out.print(sum + " ");// 1
		for (int i = 1; i <= 4; i++) {
			sum = sum * 10;// 10 100 100 1000
			System.out.print(sum + " ");
		}
		System.out.println();

		// generate the series 1 -2 3 -4 5 -6 7 -8 9 -10
		for (int j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				System.out.print(-j + " ");

			} else {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		// generate the series =0 1 3 6 10...
		int add = 0;
		for (int k = 0; k <= 8; k++) {
			add = add + k;
			System.out.print(add + " ");
		}

		System.out.println();
		// print series 3 6 9 ...30
		for (int l = 1; l <= 10; l++) {
			// System.out.print(l*3+" ");
			System.out.print(l + l + l + " ");
		}
		System.out.println();
		// another way to solve this question
		for (int m = 1; m <= 30; m++) {
			if (m % 3 == 0) {
				System.out.print(m + " ");
			}

		}
		System.out.println();
		// Fibonacci Series
		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int o = 1; o <= 8; o++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");

		}
		System.out.println();
//Generate the series 1 2 3 4 5 4 3 2 1 
		for (int p = 1; p <= 5; p++) {
			System.out.print(p + " ");
		}
		for (int q = 4; q >= 1; q--) {
			System.out.print(q + " ");
		}
		System.out.println();
		// Generate the series 1 10 100 1000 100 10 1
		int r = 1;
		System.out.print(r + " ");
		for (int s = 1; s <= 3; s++) {
			r = r * 10;
			System.out.print(r + " ");
		}
		int u = 100;
		System.out.print(u + " ");
		for (int t = 1; t <= 2; t++) {
			u = u / 10;
			System.out.print(u + " ");
		}
		System.out.println();
		// Generate the series 2 4 6 8 10..20
		for (int v = 1; v <= 10; v++) {
			System.out.print(v + v + " ");

			// System.out.print(v*2+" " );// another way to solve this question
		}
		System.out.println();
		// another way
		for (int w = 1; w <= 20; w++) {
			if (w % 2 == 0) {
				System.out.print(w + " ");

			}

		}
	}

}
