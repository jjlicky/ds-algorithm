package programmers;
import java.util.*;
import java.util.Collections;
//arraylist 이용. 시간초과
public class heap_scoville {
	
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        int mix = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i=0; i<scoville.length;i++) {
        	list.add(scoville[i]);
        }
                
        while(true) {
        	Collections.sort(list);
        	if (list.get(0)>=K) break;
        	else {
        		mix = list.get(0) + 2*list.get(1);
        		list.add(mix);
            	list.remove(0);
            	list.remove(0);
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
