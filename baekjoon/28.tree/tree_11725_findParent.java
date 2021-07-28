package bj_algorithm;
import java.util.*;

public class tree_11725_findParent {
	static int[] parents;
	static List<Integer>[] list;
	static boolean[] visited;
	static int n;
	
	private static void dfs(int v) {
		visited[v] = true;
		for (int i : list[v]) {
			if (!visited[i]) {
				parents[i] = v;
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();
		
		list = new ArrayList[n+1]; parents = new int[n+1];
		for (int i = 1; i <= n; i++) list[i] = new ArrayList<>();
		
		visited = new boolean[n+1];
		for (int i = 1; i < n; i++) {
			int a = stdIn.nextInt(), b = stdIn.nextInt();
			list[a].add(b); list[b].add(a);
		}
		
		dfs(1);
		for (int i = 2; i <= n; i++) System.out.println(parents[i]);
	}
}
