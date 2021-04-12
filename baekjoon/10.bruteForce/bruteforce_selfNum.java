package bj_algorithm;
import java.util.Scanner;

public class bruteforce_selfNum {
	
	static int dn(int x) {
		
		int res = 0;
		int sum = 0;
		int div = x;
		
		while(true) {
			res = div%10;
			div/=10;
			sum += res;
			if (div==0)
				return sum+x; 
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int res = 0;
		
		for (int i=n; i>0; i--) {
			dn(i);
			if (dn(i)==n) {
				res = i;
			}
		}
		System.out.println(res);
	}
}
