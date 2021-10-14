import java.util.Scanner;

public class Animals {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String first = scan.nextLine();
		String second = scan.nextLine();
		String third = scan.nextLine();

		if (first.equals("vertebrado")) {
			if (second.equals("ave")) {
				if (third.equals("carnivoro")) {
					System.out.println("aguia");
				} else if (third.equals("onivoro")) {
					System.out.println("pomba");
				}
			} else if (second.equals("mamifero")) {
				if (third.equals("onivoro")) {
					System.out.println("homem");
				} else if (third.equals("carnivoro")) {
					System.out.println("vaca");
				}

		} else if (first.equals("invertebrado")) {
			if (second.equals("inseto")) {
				if (third.equals("hematofago")) {
					System.out.println("pulga");
					

				}
			}
		}
