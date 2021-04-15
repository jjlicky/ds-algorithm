package bj_algorithm;
import java.util.Scanner;

// #dp(동적계획법) #bottom-up #너무어려움
public class dp_makeToOne {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] dp = new int [n+1];
		
		for (int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + 1;
			if (i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
			if (i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
		}
		System.out.println(dp[n]);
	}
}
