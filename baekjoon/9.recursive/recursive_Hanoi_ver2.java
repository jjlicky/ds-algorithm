package bj_algorithm;
import java.util.Scanner;



public class recursive_Hanoi_ver2 {
	private static StringBuilder sb = new StringBuilder();
	
	static int k (int x) {
		int a=1;
		for(int i=0; i<x; i++)
			a*=2;
		return a-1;
			
	}
	static void hanoi (int no, int x, int y) {
		
		if	(no>1) hanoi(no-1,x,6-x-y);
		
		sb.append(x + " " + y + "\n");
		
		if	(no>1) hanoi(no-1,6-x-y,y);

		
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		sb.append(k(n) + "\n");
		hanoi(n,1,3);
		System.out.println(sb);
	}
}
