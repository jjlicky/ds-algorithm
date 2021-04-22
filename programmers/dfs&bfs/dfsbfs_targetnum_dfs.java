package programmers;

public class dfsbfs_targetnum_dfs {
	 
	public int solution(int[] numbers, int target) {
		int answer = 0;
		int cur = numbers[0];
		answer += dfs(cur,1,numbers,target);
		answer += dfs(-cur,1,numbers,target);
		return answer;
	}
	
	public int dfs(int pre, int index, int[] numbers, int target) {
		
		if (index>=numbers.length) {
			if (target==pre) {
				return 1;
			}
			return 0;
		}
		
		int cur1 = pre + numbers[index];
		int cur2 = pre - numbers[index];
		
		int ans=0;
		ans += dfs(cur1, index+1, numbers, target);
		ans += dfs(cur2, index+1, numbers, target);
		
		return ans;
	}
	
}
