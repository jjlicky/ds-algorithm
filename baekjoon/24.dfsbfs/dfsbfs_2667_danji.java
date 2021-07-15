package bj_algorithm;
import java.io.*;
import java.util.*;

public class dfsbfs_2667_danji {
	
	static int check[][];
	static int checked[][];
	static int n,cnt;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	
	static ArrayList list = new ArrayList();
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();
		
		check = new int[n][n];
		checked = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			String input = stdIn.next();
			for (int j = 0; j < n; j++) {
				check[i][j] = input.charAt(j)-'0';		// 배열 한 줄로 입력받기
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (check[i][j]==1 && checked[i][j]==0) {
					cnt = 1;
					dfs(i,j);
					list.add(cnt);
				}
			}
		}
	
		Collections.sort(list);
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	static int dfs(int x, int y) {
		
		checked[x][y] = 1;
		
		for (int i = 0; i < 4; i++) {
			
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
				if (check[nx][ny] == 1 && checked[nx][ny] == 0) {
					dfs(nx,ny);
					cnt++;
				}
			}
		}
		return cnt;
	}
}
