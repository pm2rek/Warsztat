import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		System.out.println("Pomyśl jakąś liczbę od 0 do 1000, a ja zgadne ją w max 10 próbach");
		int max = 1001;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i < 11) {
			String answer = "";
			int guess = (max - min) / 2 + min;
			System.out.println("Zgaduje: " + guess);
			System.out.println("Podaj jedną z możliwości: \"dużo\", \"mało\", \"zgadłeś\"");
			int check = 0;
			while (check < 1) {
				//System.out.println(check + "check");
				answer = sc.next();
				if (answer.matches("(dużo|mało|zgadłeś)")) {
					check++;
				} else {
					System.out.println("Podaj jeszcze raz.");
				}
			}
			if (i == 10) {
				System.out.println("Nie oszukuj");
				break;
			} else if (answer.matches("zgadłeś")) {
				System.out.println("wygrałem");
				break;
			} else if (answer.matches("dużo")) {
				max = guess;
				i++;
				System.out.println("To już " + i + " próba");
			} else if (answer.matches("mało")) {
				min = guess;
				i++;
				System.out.println("To już " + i + " próba");
			}
		}

	}

}
