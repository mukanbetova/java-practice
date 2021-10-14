import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int sum = 0;
		int counter = 0;

		int number;

		/*do {
			number = scan.nextInt();

			counter++;
			sum += number;

		}*/ while(true) {
			number = scan.nextInt();
			
			if (number == 0) break;

			counter++;
			sum += number;
		}

		System.out.printf("Arithmetic mean is %.2f%n", (double) sum / counter);

	}
}