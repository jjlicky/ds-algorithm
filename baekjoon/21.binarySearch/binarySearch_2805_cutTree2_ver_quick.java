package bj_algorithm;
import java.util.*;

public class binarySearch_2805_cutTree2_ver_quick {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int [] tree = new int [N];
		
		for (int i = 0; i < N; i++) {
			tree[i] = stdIn.nextInt();
		}
		Arrays.sort(tree);
		
		for (int i = 0; i < N; i++) {
			System.out.println(tree[i]);
		}
		
		int start = tree[0];
		int ans = 0;
		
		while (start <= tree[N-1]) {
			
			for (int i = 0; i < N; i++) {
				if (tree[i] >= start) {
					ans += (tree[i] - start);
				}
			}
			
			if (ans == M) {
				break;
			}
			ans = 0;
			start += 1;
		}
		System.out.println(start);
	}
}