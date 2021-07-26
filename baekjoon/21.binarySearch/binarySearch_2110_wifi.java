package bj_algorithm;
import java.util.*;

public class binarySearch_2110_wifi {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int C = stdIn.nextInt();
		int x[] = new int [N];
		
		for (int i = 0; i < N; i++) {
			x[i] = stdIn.nextInt();
		}
		Arrays.sort(x);
		
		int left = 1;	// ������ �ּҰŸ�
		int right = x[N-1]-x[0];	// ������ �ִ�Ÿ�
		int d = 0;
		int ans = 0;
		
		while (left <= right) {
			int mid = (left + right) / 2;	// ����
			int start = x[0];
			int cnt = 1;
			
			for (int i = 1; i < N; i++) {	// d(����)�� �������� ������ ��ġ
				d = x[i] - start;
				if (mid <= d) {
					cnt++;
					start = x[i];
				}
			}
			
			if (cnt >= C) {		// ������ ���� ���δ� -> ������ ������
				ans = mid;
				left = mid + 1;
			} else {		// �����Ⱑ �� �þ���Ѵ� -> ������ ������
				right = mid - 1;
			}
		}
		System.out.println(ans);
	}
}