import java.util.Scanner;

public class SumOfDigits {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a four-digit number: ");

		int number = scan.nextInt(); // 1 + 2 + 3 + 4 = 10
		// int numberCopy = number;
		// System.out.print("Sum of digits of number " + number)
		int sum = 0;

		sum += number%10;
		number /= 10;

		sum += number%10;
		number /= 10;

		sum += number%10;
		number /= 10;

		sum += number%10;
		number /= 10;


		System.out.println(sum); // System.out.printf("Number = %d, Sum of digits = %d%n");
		System.out.println(number);
	}
}