package programmers;
import java.util.*;

public class search_moi {
	
	public static int[] solution(int[] answers) {
        
	int[] answer = {};
        int[] check1 = {1,2,3,4,5};
        int[] check2 = {2,1,2,3,2,4,2,5};
        int[] check3 = {3,3,1,1,2,2,4,4,5,5};
        int ans1=0,ans2=0,ans3=0;
        
        for (int i=0;i<answers.length;i++) {
        	if (check1[i%check1.length]==answers[i]) ans1++;
        	if (check2[i%check2.length]==answers[i]) ans2++;
        	if (check3[i%check3.length]==answers[i]) ans3++;
        }
        int max = Math.max(Math.max(ans1,ans2),ans3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==ans1) list.add(1);
        if(max==ans2) list.add(2);
        if(max==ans3) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i]=list.get(i);
        }
        return answer;
    }
	public static void main(String[] args) {
		int [] a = {1,3,2,4,2};
		
		for(int i=0;i<solution(a).length;i++)
			System.out.println(solution(a)[i]);
	}
}
