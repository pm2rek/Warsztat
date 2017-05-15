import java.util.ArrayList;
import java.util.Random;

public class Main2a {

	public static void main(String[] args) {
		// Lotto symulator.
		Random rad = new Random();
		int win = 6;
		long counter = 0;
		while (win != 0) {
			// Generate numbers.
			int count = 0;
			ArrayList<Integer> randomNumbers1 = new ArrayList<Integer>();
			while (count != 6) {
				int temp = rad.nextInt(48) + 1;
				if (!randomNumbers1.contains(temp)) {
					randomNumbers1.add(temp);
					count++;
				}
			}
			count = 0;
			// Generate numbers.
			ArrayList<Integer> randomNumbers2 = new ArrayList<Integer>();
			while (count != 6) {
				int temp = rad.nextInt(48) + 1;
				if (!randomNumbers2.contains(temp)) {
					randomNumbers2.add(temp);
					count++;
				}
			}
			count = 0;
			randomNumbers1.sort(null);
			//System.out.println(randomNumbers1);
			randomNumbers2.sort(null);
			//System.out.println(randomNumbers2);
			randomNumbers1.removeAll(randomNumbers2);
			win = randomNumbers1.size();
			//System.out.println("wygrana " + win);
			counter++;
		}
		System.out.println(counter);
	}
}
