import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// Lotto symulator.
		Random rad = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> userNumbers = new ArrayList<Integer>();
		int count = 0;

		// takes numbers from user
		while (count != 6) {
			System.out.println("Podaj liczbe z przedzialu 1-49");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("To nie jest liczba");
			}
			int temp = sc.nextInt();
			if (temp > 0 && temp < 50 && !userNumbers.contains(temp)) {
				userNumbers.add(temp);
				count++;
			} else {
				System.out.println("Liczba musi być z zakresu 1-49 i nie może się powtarzać.");
			}
		}
		sc.close();
		count = 0;
		// Generate numbers
		ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
		while (count != 6) {
			int temp = rad.nextInt(48) + 1;
			if (!randomNumbers.contains(temp)) {
				randomNumbers.add(temp);
				count++;
			}
		}
		userNumbers.sort(null);
		System.out.println("Twoje liczby to: ");
		for (int temp : userNumbers) {
			System.out.print(temp + ", ");
		}
		System.out.println("\nWylosowane liczby to:");
		for (int temp : randomNumbers) {
			System.out.print(temp + ", ");
		}
		// Compare numbers
		randomNumbers.sort(null);
		userNumbers.removeAll(randomNumbers);
		int win = 6 - userNumbers.size();
		
			System.out.println("\nTrafiłeś " + win + " liczby. Brawo!");
		
	}

}
