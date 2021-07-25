package bj_algorithm;
import java.util.*;

public class queue_11866_yosefus {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while (q.size() > 1) {
			for (int i = 0; i < k-1; i++) {
				int remove = q.poll();
				q.offer(remove);
			}
			sb.append(q.poll()).append(", ");
		}
		sb.append(q.poll()).append(">");
		System.out.println(sb);		
	}
}
