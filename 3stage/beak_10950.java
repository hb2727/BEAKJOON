package beakjoon;

import java.util.Scanner;

public class beak_10950 {

	public static void main(String[] args) {
		
		int i;
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (i = 0; i < n; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();

			System.out.println(A + B);
		}
		scan.close();
	}
}
