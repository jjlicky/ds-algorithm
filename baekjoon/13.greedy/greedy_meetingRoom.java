package bj_algorithm;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class greedy_meetingRoom {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[][] time = new int [n][2];
		
		for (int i=0; i<n; i++) {
			time[i][0] = stdIn.nextInt();
			time[i][1] = stdIn.nextInt();
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			
			public int compare(int[] a, int[] b) {
				
				if(a[1]==b[1]) {
					return a[0]-b[0];
				}// 오름차순  cf) b[0]-a[0] -> 내림차순
				
				return a[1]-b[1];
			}
		});
		
		int cnt = 0;
		int end_time = 0;
		
		for (int i=0; i<n; i++) {
			
			if (end_time<=time[i][0]) {
				end_time = time[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
