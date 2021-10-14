import java.util.Scanner;

public class Inch  {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final double CM_PER_INCH = 2.54;
		int inches = scan.nextInt();

		// System.out.println(inches + " in." + " = " + (inches * CM_PER_INCH) + " cm.");

		System.out.printf("%d in. = %.2f cm.\n", inches, (inches * CM_PER_INCH));
	}
}