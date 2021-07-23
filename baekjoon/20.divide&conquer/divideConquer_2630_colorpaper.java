package bj_algorithm;
import java.util.Scanner;

public class divdeConquer_2630_colorpaper {
	
	static int white = 0;
	static int blue = 0;
	static int[][] board;
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		
		board = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = stdIn.nextInt();
			}
		}
	
		partition(0,0,N);
		
		System.out.println(white);
		System.out.println(blue);
	}
	
	public static void partition(int row, int col, int size) {
		
		if (colorCheck(row, col, size)) {
			if (board[row][col] == 0) {
				white+=1;
			}
			else {
				blue+=1;
			}
			return;
		}
		
		int newSize = size/2;
		
		partition(row, col, newSize);
		partition(row, col + newSize, newSize);
		partition(row + newSize, col, newSize);
		partition(row + newSize, col + newSize, newSize);
	}
	
	public static boolean colorCheck(int row, int col, int size) {
		
		int color = board[row][col];
		
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				
				if (board[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}

// https://st-lab.tistory.com/227 ÂüÁ¶
