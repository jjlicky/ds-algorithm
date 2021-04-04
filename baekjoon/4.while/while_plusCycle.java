package bj_algorithm;
import java.util.Scanner;

public class while_plusCycle {
	
	
	static void cycle(int x) {
		
		int i=0;
		int xCopy=x;
		while(true) {
			int a = x/10;
			int b = x%10;
			int c = a+b;
			if(c>=10)
				c%=10;
			int d = b*10 + c;
			i++;
			
			if(d==xCopy) break;
			else x=d;
		}
		System.out.print(i);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			
			n = stdIn.nextInt();
			
		}while(0>n || n>99);
		
		cycle(n);
			
	}
}
