package bj_algorithm;
import java.util.*;

public class numTheory_1037_divisor {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		int max = Integer.MIN_VALUE;	// ������ �ּҰ�
		int min = Integer.MAX_VALUE;	// ������ �ִ밪
		
		for (int i=0; i<num; i++) {
			int divisor = stdIn.nextInt();
			
			if (divisor > max) max = divisor;
			if (divisor < min) min = divisor;			
		}
		System.out.println(max*min);		// ����� �ּҰ��� �ִ밪�� ���ϸ� N�̵�
	}
}
