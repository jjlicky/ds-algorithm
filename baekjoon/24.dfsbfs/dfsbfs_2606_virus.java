package bj_algorithm;
import java.io.*;
import java.util.*;

public class dfsbfs_virus {
	
	static int[][] check;
	static boolean[] checked;
	static int num;
	static int connect;
	static int cnt=0;
	
	public static void main(String[] args) throws IOException{
		Scanner stdIn = new Scanner(System.in);
		num = stdIn.nextInt();
		connect = stdIn.nextInt();
		
		check = new int[101][101];
		checked = new boolean[101];
		
		for (int i=0; i<connect; i++) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			
			check[x][y] = check[y][x] = 1;
		}
		
		dfs(1);
		System.out.println(cnt);
	}
	
	public static void dfs(int i) {
		checked[i] = true;
		
		for (int j = 1; j <= num; j++) {
			if (check[i][j] == 1 && checked[j] == false) {
				dfs(j);
				cnt++;
			}
		}
		
	}
}
