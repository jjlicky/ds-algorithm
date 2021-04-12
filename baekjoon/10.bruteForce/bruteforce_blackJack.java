package bj_algorithm;
import java.util.Scanner;
import java.util.Vector;

// 벡터 생성해서 입력받은후 3개의 숫자 더한 모든 값중에서 찾기
public class bruteforce_blackJack {
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		Vector v = new Vector<Integer> ();
		int sum=0;
		int res=0;
		
		for (int i=0; i<n; i++) {
			int card = stdIn.nextInt();
			v.add(card);
		}
		
		loopOut:
		for (int a = 0; a<n; a++) {
			int sum_a = sum + (int) v.get(a);
			for (int b = a+1; b<n; b++) {
				int sum_b = sum_a + (int) v.get(b);
				for (int c = b+1; c<n; c++) {
					int sum_c = sum_b + (int) v.get(c);
					if(sum_c<m) {
						if(sum_c>res) res = sum_c;
					}
					else if (sum_c==m) {
						res = sum_c;
						break loopOut;
					}
				}
			}
		}
		sb.append(res);
		System.out.println(sb);
	}
	
}
