package programmers;
import java.util.Queue;
import java.util.LinkedList;

public class dfsbfs_targetnum_bfs {
	
	class Pair {
		int cur;
		int index;
		
		Pair(int cur, int index) {
			this.cur = cur;
			this.index = index;
		}
	}
	
	public int solution(int[] numbers, int target) {
		int answer = 0;
		
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.offer(new Pair(numbers[0],0));	// 예제의 경우 각각 +1,-1에서 시작
		queue.offer(new Pair(-numbers[0],0));
		
		while (!queue.isEmpty()) {
			Pair p = queue.poll();	// 선입선출 특성 이용해서, 먼저 들어간것부터 꺼내서 씀 (순서대로 끝까지 모든경우의 수 구함)
			if (p.index == numbers.length-1) {  // index는 0에서 시작하므로 length-1에서 끝.
				if (p.cur == target) {
					answer+=1;
				}
				continue;
			}
			int c1 = p.cur + numbers[p.index+1];
			int c2 = p.cur - numbers[p.index+1];
			
			queue.add(new Pair(c1, p.index+1));
			queue.add(new Pair(c2, p.index+1));
		}
		return answer;
	}
}
