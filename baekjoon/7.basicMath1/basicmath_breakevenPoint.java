package bj_algorithm;
import java.util.Scanner;

public class basicmath_breakevenPoint {
	
	static int point(int a, int b, int c) {
		
		if(c<=b) return -1;
		else {
			int i = (a/(c-b));
			return i+1;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); 
		
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt(); // 한줄에 다받음
		
		System.out.println(point(A,B,C));
	}
}
