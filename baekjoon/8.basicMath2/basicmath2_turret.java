package bj_algorithm;
import java.util.Scanner;

// 외접만생각하고 내접은 생각못함!!!!
public class basicmath2_turret {
	
	public static void main(String[] args) {
		Scanner stdIn1 = new Scanner(System.in);
		
		int T = stdIn1.nextInt();
		
		for(int i=1; i<=T; i++) {
			int x1 = stdIn1.nextInt();
			int y1 = stdIn1.nextInt();
			int r1 = stdIn1.nextInt();
			int x2 = stdIn1.nextInt();
			int y2 = stdIn1.nextInt();
			int r2 = stdIn1.nextInt();
					
			double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			int abs = Math.abs(r1-r2); // abs : 절대값
					
			if (x1==x2 && y1==y2 && r1==r2) System.out.println(-1);
				
			else if ((r1+r2) < d || (x1==x2 && y1==y2 && r1!=r2) || d<abs) 
				{System.out.println(0);}
			else if ((r1+r2) == d || d==abs) 
				{System.out.println(1);}
			else if ((r1+r2) > d && abs<d) 
				{System.out.println(2);}
		}		
	}
}
