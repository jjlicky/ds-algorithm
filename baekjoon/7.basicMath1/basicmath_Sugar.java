package bj_algorithm;
import java.util.Scanner;

public class basicmath_Sugar {
	
	static int sugar(int x) {
		
		for(int i=x/5; i>=0;i--) {
			int x2 = x;
			x2-=5*i;
			if(x2%3==0) return (x2/3+i);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		System.out.println(sugar(n));
	}
} 
