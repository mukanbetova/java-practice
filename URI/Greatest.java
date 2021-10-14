import java.util.Scanner;
public class Greatest  {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //54
		int b = scan.nextInt(); //7
		int c = scan.nextInt(); //80
		// (a + b + abs(a-b)) / 2 = greatest
		int max = (a + b + Math.abs(a-b)) / 2; // max = 54
		max = (c + max + Math.abs(c - max)) / 2; // maxTwo = 80

		System.out.println(max + " eh o maior");

	}
}