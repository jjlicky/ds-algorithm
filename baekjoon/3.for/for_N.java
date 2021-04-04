package bj_algorithm;
import java.util.Scanner;

public class for_N {
	
	
	static void oneToN(int x) {
		for(int i=1; i<=x; i++)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.println("ют╥б:");
			n = stdIn.nextInt();
		}while(n>100000);
		
		oneToN(n);
			
	}
		
}
