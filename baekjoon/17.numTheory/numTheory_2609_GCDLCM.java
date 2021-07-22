package bj_algorithm;
import java.util.*;

public class numTheory_2609_GCDLCM {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n1 = stdIn.nextInt();
		int n2 = stdIn.nextInt();
		int max;
		int min;
		if (n1 >= n2) {
			max = n1;
			min = n2;
		}
		else {
			max = n2;
			min = n1;
		}
		
		for (int i = min; i >= 1; i--) {
			if (max%i == 0 && min%i == 0) {
				System.out.println(i);
				break;
			}
		}
		
		for (int i = max; i <= max*min; i++) {
			if (i%max == 0 && i%min == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}

// https://st-lab.tistory.com/194 블로그에 dp설명 잘나옴. 참고