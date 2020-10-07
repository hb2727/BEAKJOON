package beakjoon;

import java.util.Scanner;

public class beak_1330 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int A = scan.nextInt();
		final int B = scan.nextInt();
		
		if(A>B) {
			System.out.print(">");
		}else if(A<B) {
			System.out.print("<");
		}else {
			System.out.print("==");
		}
		
	}

}
