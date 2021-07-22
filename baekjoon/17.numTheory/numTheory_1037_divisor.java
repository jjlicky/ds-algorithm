package bj_algorithm;
import java.util.*;

public class numTheory_1037_divisor {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		int max = Integer.MIN_VALUE;	// 정수의 최소값
		int min = Integer.MAX_VALUE;	// 정수의 최대값
		
		for (int i=0; i<num; i++) {
			int divisor = stdIn.nextInt();
			
			if (divisor > max) max = divisor;
			if (divisor < min) min = divisor;			
		}
		System.out.println(max*min);		// 약수중 최소값과 최대값을 곱하면 N이됨
	}
}
