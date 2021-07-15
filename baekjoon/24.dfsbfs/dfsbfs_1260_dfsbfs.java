package bj_algorithm;
import java.io.*;
import java.util.*;

public class dfs_bfs {

	static int[][] check;
	static boolean[] checked;
	static int n;
	static int m;
	static int start;
	
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();
		m = stdIn.nextInt();
		start = stdIn.nextInt();
		
		check = new int[1001][1001];
		checked = new boolean[1001];
		
		for (int i=0; i<m; i++) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			
			check[x][y] = check[y][x] = 1;
		}
		
		dfs(start);
		
		checked = new boolean[1001];
		System.out.println();
		
		bfs();
	}
	
	public static void dfs(int i) {
		
		checked[i] = true;
		System.out.print(i + " ");
		
		for (int j = 1; j <= n; j++) {
			if (check[i][j] ==1 && checked[j] == false) {
				dfs(j);
			}
		}
	}
	
	public static void bfs() {
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		checked[start] = true;
		System.out.print(start + " ");
		
		while (!q.isEmpty()) {
			int temp = q.poll();
			
			for (int j = 1; j <= n; j++) {
				if (check[temp][j] == 1 && checked[j] == false) {
					q.offer(j);
					checked[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}
}
