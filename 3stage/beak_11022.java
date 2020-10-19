package beakjoon;

import java.util.*;

public class beak_11022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		int n = 1;

		for (int i = 0; i < T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();

			System.out.println("Case #" + n + ": " + A + " + " + B + " = " + (A + B));
			n++;
		}
		scan.close();
	}
}
