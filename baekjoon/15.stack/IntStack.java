package bj_algorithm;
import java.util.Scanner;

public class IntStack {
	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	public IntStack(int capactiy) {
		ptr = 0;
		max = capactiy;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}	
	}
	
	public int push(int x) throws OverflowIntStackException {
		if(ptr>=max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if (ptr<=0)
			return -1;
		return stk[--ptr]; 
	}
	
	public int top() throws EmptyIntStackException {
		if(ptr<=0) {
			return -1;
		}
		return stk[ptr-1];
	}
	
	public int size() {
		return ptr;
	}
	
	public int empty() {
		if (ptr<=0) return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		int n = stdIn.nextInt();
		
		for (int i=0; i<n; i++) {
			String menu = stdIn.next();
			
			if (menu.equals("top")) {		// str.equals -> 문자열 일치 확인
				System.out.println(s.top());
			}
			
			else if (menu.equals("size")) {
				System.out.println(s.size());
			}
			
			else if (menu.equals("pop")) {
				System.out.println(s.pop());
			}
			
			else if (menu.equals("empty")) {
				System.out.println(s.empty());
			}
		
			else {
				int x = stdIn.nextInt();
				s.push(x);
			}
		}
	}
}
