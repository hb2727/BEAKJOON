package beakjoon;

import java.util.*;

public class beak_10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		scan.close();
		
		for(int j=0;j<n;j++) {
			if(arr[j]<x) {
				System.out.print(arr[j]+" ");
			}
		}
	}
}
