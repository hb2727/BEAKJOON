package beakjoon;

import java.util.*;

public class beak_1110 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.close();
        
        int count=0;
        int copy=n;
        
        while(true){
            n=((n%10)*10)+(((n/10)+(n%10))%10);
            count++;
            
            if(copy==n){
                break;
            }
        }
        System.out.println(count);
	}
}
