import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// Guessing numbers.
		Random rad = new Random();
		int value = rad.nextInt(101);
		Scanner sc = new Scanner(System.in);
		int userValue = -1;
		while (!(userValue == value)) {
			System.out.println("Zgadnij liczbę!");
			// Check is number.
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("To nie jest liczba");
			}
			userValue = sc.nextInt();
			// Condition check.
			if (userValue == value) {
				System.out.println("Zgadłeś");
				break;
			} else if (userValue > value) {
				System.out.println("Za dużo! Zgaduj dalej");
			} else {
				System.out.println("Za mało");
			}
		}
		sc.close();

	}

}
