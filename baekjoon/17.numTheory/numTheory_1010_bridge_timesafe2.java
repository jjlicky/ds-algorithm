package bj_algorithm;
import java.util.*;

public class numTheory_1010_bridge_timesafe2 {
	
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = stdIn.nextInt();
		
		
		for (int i = 0; i < T; i++) {
			double N = stdIn.nextDouble();
			double M = stdIn.nextDouble();
			
			System.out.printf("%.0f\n",combi(M,N));
		}
	}

	static double combi(double n, double r) {
		double a = 1;
		double b = 1;
		
		for (double i = n; i > n-r; i--) {
			a = a * i;
		}
		
		for (double i = r; i > 0; i--) {
			b = b * i;
		}
		return a/b;
	}
}
