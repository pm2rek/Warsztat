import java.util.Random;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		Random r = new Random();
		System.out.println("Cześć!\nPodaj dane wejściowe wedle schematu \"xDy+z\"");
		Scanner sc = new Scanner(System.in);
		String cube = "";
		String p = "^[0-9]+D(3|4|6|8|10|12|20|100)[+][0-9]+$";
		int check = 0;
		while (check < 1) {
			cube = sc.next();
			if (cube.matches(p)) {
				check = 1;
			} else {
				System.out.println("Musisz podać wedłóg wzoru");
			}
		}
		sc.close();
		System.out.println(cube);
		String[] dSplit = cube.split("D");
		x = Integer.valueOf(dSplit[0]);
		String[] nextSplit = dSplit[1].split("\\+");
		y = Integer.valueOf(nextSplit[0]);
		z = Integer.valueOf(nextSplit[1]);
		int cubeValue = 0;
		for (int i = 0; i < x; i++) {
			cubeValue += r.nextInt(y) + 1;
		}
		cubeValue += z;
		System.out.println("Wartość uzyskana z kostek to: " + cubeValue);

	}

}
