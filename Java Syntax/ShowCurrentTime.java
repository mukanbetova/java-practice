import java.util.Scanner;

public class ShowCurrentTime {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

		long milliseconds = System.currentTimeMillis(); // 1 January 1970 milliseconds

		// Общее время в секундах
		long totalSeconds = milliseconds / 1000; // 1000 % 60

		// Текущие секунды
		long currentSeconds = totalSeconds % 60;

		// Общее время в минутах
		long totalMinutes = totalSeconds / 60;

		// Текущие минуты
		long currentMinutes = totalMinutes % 60;

		// Общее время в часах
		long totalHours = totalMinutes / 60;

		// Текущие часы
		long currentHour = totalHours % 24 + 6L;

		// Дни
		long totalDays = totalHours / 24;
		double currentDay = totalDays % 30.4375;

		double totalMonths = totalDays / 30.4375;
		double currentMonth = totalMonths % 12;

		double totalYears = totalMonths / 12;


		System.out.printf("Current time is Year %f Month %.0f Day %.0f %d: %d: %d%n", 
			totalYears + 1970,
			currentMonth,
			currentDay, 
			currentHour, 
			currentMinutes, 
			currentSeconds);


	}
}