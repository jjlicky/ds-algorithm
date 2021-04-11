package bj_algorithm;
import java.util.Scanner;

public class recursive_Factorial {
	
	static int factorial (int x) {
		if (x==0 || x==1) return 1;
		else if (x>1) return x*factorial(x-1);
		else return 0;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		System.out.println(factorial(n));
	}
}
