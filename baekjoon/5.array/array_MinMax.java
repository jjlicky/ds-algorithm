package bj_algorithm;
import java.util.Scanner;

class array_MinMax {
	
	static void MinMax(int[] x) {
		int max = x[0];
		int min	= x[0];
		
		for(int i=0; i<x.length;i++) {
			if(max<x[i]) max=x[i];
			if(min>x[i]) min=x[i];
		}
		System.out.print(min + " " + max);
	} 
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = stdIn.nextInt();
		}
		
		MinMax(array);
		
		
	}
}
