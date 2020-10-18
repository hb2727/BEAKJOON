package beakjoon;

import java.util.*;

public class beak_11021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int n = 0;
		
		for(int i=1; i<=T; i++) {
			
			int A = scan.nextInt();
			int B = scan.nextInt();
			n++;
			
			System.out.println("Case #"+n+": "+(A+B));
			
		}
	}
}
