package bj_algorithm;
import java.util.ArrayList;
import java.util.Scanner;

public class tree_1167_diOfTree {
	static ArrayList<Node>[] list;
	static boolean[] visited;
	static int max;
	static int node;
	
	public static class Node {
		int no;
		int cost;
		
		public Node(int no, int cost) {
			this.no = no;
			this.cost = cost;
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		list = new ArrayList[n+1];
		
		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < n; i++) {
			int s = stdIn.nextInt();
			while(true) {
				int no = stdIn.nextInt();
				if (no == -1) break;
				int cost = stdIn.nextInt();
				list[s].add(new Node(no, cost));
			}
		}
		
		visited = new boolean[n+1];
		dfs(1,0);
		
		visited = new boolean[n+1];
		dfs(node, 0);
		
		System.out.println(max);
	}
	
	public static void dfs(int x, int len) {
		if (len > max) {
			max = len;
			node = x;
		}
		visited[x] = true;
		
		for (int i = 0; i < list[x].size(); i++) {
			Node n = list[x].get(i);
			if (visited[n.no] == false) {
				dfs(n.no, n.cost + len);
				visited[n.no] = true;
			}
		}

	}
	
	
}
