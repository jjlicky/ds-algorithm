package bj_algorithm;
import java.util.Scanner;

public class Stack_10828_stack {
	
	public static int[] stack;
	public static int size = 0;
	
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = stdIn.nextInt();
		
		stack = new int[N];
		
		for (int i=0; i<N; i++) {
			
			String str = stdIn.next();
			
			switch (str) {
			
			case "push":
				push(stdIn.nextInt());
				break;
				
			case "pop":
				sb.append(pop());
				break;
			
			case "size":
				sb.append(size());
				break;
			
			case "empty":
				sb.append(empty());
				break;
				
			case "top":
				sb.append(top());
				break;
			}
			if (!str.equals("push")) {
				System.out.println(sb);
			}
			sb.setLength(0);
		}
		
	}
	
	public static void push (int item) {
		stack[size] = item;
		size++;
	}
	
	public static int pop() {
		if (size==0) return -1;
		else {
			int res = stack[size-1];
			stack[size-1]=0;
			size--;
			return res;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if (size==0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public static int top() {
		if (size==0) {
			return -1;
		}
		else {
			return stack[size-1];
		}
	}
}
