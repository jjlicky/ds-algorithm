package bj_algorithm;
import java.util.*;
import java.io.*;

public class Stack_9012_Gualho {
	
	static String check(String str) {
		ArrayList<Character> stack = new ArrayList<>();
		for (int i=0; i<str.length();i++) {
			if (str.charAt(i) == '(') {
				stack.add('(');
			}
			else {
				if(stack.isEmpty()) return "NO";
				else  stack.remove(stack.size()-1);
			}
		}
		if (stack.isEmpty()) return "YES";
		else return "NO";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		
		for (int i=0; i<n; i++) {
			bw.append(check(br.readLine()) +  "\n");
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}
	
