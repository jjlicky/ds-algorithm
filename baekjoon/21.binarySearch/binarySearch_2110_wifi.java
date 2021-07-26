package bj_algorithm;
import java.util.*;

public class binarySearch_2110_wifi {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int C = stdIn.nextInt();
		int x[] = new int [N];
		
		for (int i = 0; i < N; i++) {
			x[i] = stdIn.nextInt();
		}
		Arrays.sort(x);
		
		int left = 1;	// 가능한 최소거리
		int right = x[N-1]-x[0];	// 가능한 최대거리
		int d = 0;
		int ans = 0;
		
		while (left <= right) {
			int mid = (left + right) / 2;	// 기준
			int start = x[0];
			int cnt = 1;
			
			for (int i = 1; i < N; i++) {	// d(간격)를 기준으로 공유기 설치
				d = x[i] - start;
				if (mid <= d) {
					cnt++;
					start = x[i];
				}
			}
			
			if (cnt >= C) {		// 공유기 수를 줄인다 -> 간격을 넓힌다
				ans = mid;
				left = mid + 1;
			} else {		// 공유기가 더 늘어야한다 -> 간격을 좁힌다
				right = mid - 1;
			}
		}
		System.out.println(ans);
	}
}