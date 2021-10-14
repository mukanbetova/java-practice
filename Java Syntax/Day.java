import java.util.Scanner;

public class Day {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int month = scan.nextInt();
		int year = scan.nextInt();

		/*if (month == 1 || month == 3 || 5 || 7 || 8 || 10 || 12) {
			System.out.println("31");
			if (month == 4 || 6 || 9 || 11) {
				System.out.println("30");
				if (month == 2 && (year % 4 == 0 ))
			}
		}
		*/



		switch(month) {
			case 1: 
			System.out.println("31");
			break;
			case 2:
			if (month == 2 && (year % 4 == 0 || year % 400 == 0 )) {
				System.out.println("28");
			}
			if (month == 2 && (year % 4 > 0 || year % 400 > 0 )) {
				System.out.println("29");
			}
			break;
			case 3:
			System.out.println("31");
			break;
			case 4:
			System.out.println("30");
			break;
			case 5:
			System.out.println("31");
			break;
			case 6:
			System.out.println("30");
			break;
			case 7:
			System.out.println("31");
			break;
			case 8:
			System.out.println("31");
			break;
			case 9:
			System.out.println("30");
			break;
			case 10:
			System.out.println("31");
			break;
			case 11:
			System.out.println("30");
			break;
			case 12:
			System.out.println("31");
			break;

		}






	}
}