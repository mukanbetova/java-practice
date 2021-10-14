import java.util.Scanner;

public class BooleanPractice {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);

		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);

		System.out.printf("%d + %d = ", x, y);

		int result = scan.nextInt();

	boolean isCorrect = x + y == result;

	System.out.println(isCorrect);
	System.out.printf("%d + %d is %d? %b ", x, y, result, isCorrect);

	String answerCorrect = String.format("%d + %d is %d? %b", x, y, result, isCorrect);
	String answerIncorrect = String.format("%d + %d is %d? %b. Correct answer is %d", x, y, result, isCorrect, (x + y));

	System.out.println(isCorrect ? answerCorrect : answerIncorrect);


		//System.out.println((int) (Math.random() *10) + ":" + (int) (Math.random() *10));
		

		/* Операторы сравнения
		>
		<
		==
		>=
		<=
		!=
		Каждый из них генерирует boolean значение:либо true, либо false
		*/
		

	}
}