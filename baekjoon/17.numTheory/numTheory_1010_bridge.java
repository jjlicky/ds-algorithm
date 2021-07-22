package bj_algorithm;
import java.util.*;

public class numTheory_1010_bridge {
	
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = stdIn.nextInt();
		
		
		for (int i = 0; i < T; i++) {
			int N = stdIn.nextInt();
			int M = stdIn.nextInt();
			
			sb.append(combi(M,N)).append('\n');
		}
		
		System.out.println(sb);
	}

	static int combi(int n, int r) {
		
		if (dp[n][r]>0) return dp[n][r];
		
		if (n == r || r == 0) return dp[n][r]=1;
		
		return combi(n-1,r-1) + combi(n-1,r);
	}
}
