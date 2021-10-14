import java.util.Scanner;
import java.util.Random;

public class Conditions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		Random rnd = new Random();

		int x = rnd.nextInt(100);
		int y = rnd.nextInt(100);

		int correctAnswer = x + y;

		System.out.printf("%d +%d = ", x, y);
		int userAnswer = scan.nextInt();

		if (correctAnswer == userAnswer) {
			System.out.println("You are Correct!");
		} else {
			System.out.println("Your answer is incorrect");
			System.out.printf("%d + %d is %d%n", x, y, correctAnswer);
		}


		//String res = userAnswer == correctAnswer ? 
	}
}*/
int a = scan.nextInt();
int b = scan.nextInt();

if (a > b) {
	System.out.println(a);
} else if (b > a) { 
    System.out.println(b);
} else {
	System.out.println("Both are equal");
}
}


int a = 1;
if (a++ ==2){
	
}
