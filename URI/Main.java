import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numberA = console.nextInt();
		int numberB = console.nextInt();
		int numberC = console.nextInt();
		int numberD = console.nextInt();
		System.out.println("DIFERENCA = " + (numberA * numberB - numberC * numberD));

	}
}