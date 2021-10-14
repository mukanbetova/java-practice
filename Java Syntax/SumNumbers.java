import java.util.*;

public class SumNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();

		System.out.print("Number of tests: ");
		int testsCount = scan.nextInt();

		for (int i = 0; i < testsCount; i++) {
		int x = rnd.nextInt(10);
		int y = rnd.nextInt(10);	

		int correctAnswer = x + y;

		System.out.printf("%d + %d = ? Answer: ", x, y);
		int answer = scan.nextInt();

		while (answer != correctAnswer) {
			System.out.println("Incorrect! Try again...");
			System.out.printf("%d + %d = ? Answer: ", x, y);
			System.out.println("Correct!");
			System.out.println();
		}
		}

		