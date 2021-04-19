package bj_algorithm;
import java.util.Scanner;

public class num_factorial0 {

	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int cnt0 = 0;

		
		while (n>=5) {
			cnt0 += n/5;
			n/=5;
		}
		System.out.println(cnt0);		
	}
}
