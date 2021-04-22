package programmers;
import java.util.Arrays;

public class sort_Knum {
	
	public static int[] solution(int[] array, int[][] commands) {
	  int[] temp = {};
	  int[] answer = new int [commands.length];
	  for(int i=0;i<commands.length;i++) {
	     temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]); // start 지점은 정확한 index, end는 end전까지
	     // 그래서 시작지점은 -1 해주고, 끝은 그대로
	     Arrays.sort(temp);
	     answer[i] = temp[commands[i][2]-1];
	  }
	  return answer;
	}

	
	public static void main(String[] args) {
		int [] a = {1,5,2,6,3,7,4};
		int [][] b = {{2,5,3},{4,4,1},{1,7,3}};
		for(int i=0; i<b.length;i++) {
			System.out.println(solution(a,b)[i]);
		}
	}

}
