package programmers;
import java.util.Arrays;

public class hash_maraton {
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i=0; i<completion.length;i++) {
            if (participant[i]!=completion[i]) {
                answer = participant[i];
                break;
            } 
        }
        if (answer=="") return participant[participant.length-1];
        else return answer;
    }
	
	public static void main(String[] args) {
		
		String[] a = {"leo","kiki","eden"};
		String[] b = {"eden","kiki"};
		
		System.out.println(solution(a,b));
	}
}
