import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// типДанных название = значение;
		System.out.print("Fullname: ");
		String fullname = scan.nextLine();

		System.out.print("Age: ");
		int age = scan.nextInt();

		char gender = 'M';

		System.out.print("Is a student: ");
		boolean isStudent = scan.nextBoolean();

		System.out.print("Inn: ");
		long inn = scan.nextLong();

		float height = 170.1F;
		double weight = 70.6;


		System.out.println("Name " +fullname);
		System.out.println("Age " +age);
		System.out.println("Gender " +gender);
		System.out.println("He is a student " +isStudent);
		System.out.println("His INN is " +inn);
		System.out.println("His height is " +height);
		System.out.println("His weight is " +weight);

	}
}