import java.util.Scanner;

public class SimpleSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		String inputOrder = a + "\n" + b + "\n" + c;

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		if (a > c) {
			int t = a;
			a = c;
			c = t;
		}
		if (b > c) {
			int t = b;
			b = c;
			c = t;
		}


		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("\n" + inputOrder);
	}
}