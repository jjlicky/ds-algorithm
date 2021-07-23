package bj_algorithm;

import java.util.Scanner;

public class divideConquer_1992_quadTree {
	static int[][] picture;
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		picture = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			String str = stdIn.next();		// 한줄씩 입력받음 (입력시 띄어쓰기가 없음, colorpaper와 차이점)
			
			for (int j = 0; j < N; j++) {
				picture[i][j] = str.charAt(j) - '0';
			}
		}
		partition(0,0,N);
	}
	
	public static void partition(int row, int col, int size) {
		
		if (check(row, col, size)) {
			System.out.print(picture[row][col]);
			return;
		}
		int newSize = size/2;
	
		System.out.print('(');
		
		partition(row, col, newSize);
		partition(row, col + newSize, newSize);
		partition(row + newSize, col, newSize);
		partition(row + newSize, col + newSize, newSize);
		
		System.out.print(')');
	}
	
	public static boolean check(int row, int col, int size) {
		
		int color = picture[row][col];
		
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				
				if (picture[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}
