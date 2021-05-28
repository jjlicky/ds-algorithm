package programmers;
import java.util.PriorityQueue;

public class heap_scoville_priorityQueue {
	public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue();
        
        for (int i=0; i<scoville.length;i++) {
        	heap.add(scoville[i]);
        }
                
        while(true) {
        	if (heap.size()==1 && heap.peek()<K) return -1;
        	if (heap.peek()>=K) break;
        	else {
        		int a = heap.poll(); //첫번째 값 제거하고 반환
        		int b = heap.poll();
        		
        		int result = a+(b*2);
        		
        		heap.add(result);
        		answer++;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int [] a = {1,2,3,9,10,12};
		int b = 7;
		
		System.out.println(solution(a,b));
	}
}
