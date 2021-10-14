import java.util.Scanner;

public class Banknotes {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		number+= number / 100;
		// banknote100
		// banknote50
		// banknote20
		// banknote10
		// banknote5
		// banknote2
		// banknote1

		/* System.out.println(number);
		System.out.println(number / 100 + " nota(s) de R$ 100,00");
		System.out.println(number / 50 + " nota(s) de R$ 50,00");
		System.out.println(number / 20 + " nota(s) de R$ 20,00");
		System.out.println(number / 10 + " nota(s) de R$ 10,00");
		System.out.println(number / 5 + " nota(s) de R$ 5,00");
		System.out.println(number / 2 + " nota(s) de R$ 2,00");
		System.out.println(number / 1 + " nota(s) de R$ 1,00"); */

	}
}