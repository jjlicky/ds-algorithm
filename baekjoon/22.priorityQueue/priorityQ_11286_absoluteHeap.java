package bj_algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class priorityQ_11286_absoluteHeap {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> 
			Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2))
		);  // 우선순위 큐에서 두값 비교하는 형식, 절대값 적용 - 같을경우 숫자가 실제수로 비교, 다를 경우 절대값으로 비교
		
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if (x == 0) {
				if (heap.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(heap.poll());
				}
			}
			else {
				heap.offer(x);
			}
		}
	}
}
