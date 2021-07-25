package bj_algorithm;
import java.util.*;

public class queue_1021_rollingQueue {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		LinkedList<Integer> dq = new LinkedList<Integer>();
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			dq.offer(i);
		}
		
		int [] pick = new int[m];
		
		for (int i = 0; i < m; i++) {
			pick[i] = stdIn.nextInt();
		}
		
		for (int i = 0; i < m; i++) {

			int target_idx = dq.indexOf(pick[i]);
			int half_idx;
			
			if (dq.size() % 2 == 0) {
				half_idx = dq.size() / 2 - 1;
			}
			else {
				half_idx = dq.size() / 2;
			}
			
			if (target_idx <= half_idx) {
				for (int j = 0; j < target_idx; j++) {
					int left = dq.pollFirst();
					dq.offerLast(left);
					cnt++;
				}
			}
			else {
				for (int j = 0; j < dq.size() - target_idx; j++) {
					int right = dq.pollLast();
					dq.offerFirst(right);
					cnt++;
				}
			}
			dq.pollFirst();
		}
		System.out.println(cnt);
	}
}

// deque(µ¦) °³³ä¼³¸í - https://hbase.tistory.com/128
// ¹®Á¦Çª´Â ÆÁ(ÀÎµ¦½º ÀÌ¿ëÇØ¼­ ½±°Ô ÇØ°á) - https://st-lab.tistory.com/216