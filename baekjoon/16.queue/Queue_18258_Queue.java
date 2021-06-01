package bj_algorithm;
import java.util.*;
import java.io.*;
public class Queue_18258_Queue {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		//ArrayList<Integer> queue = new ArrayList<Integer>(); --> ArrayList 사용시
		String str = null;
		String command = null;
		int rear = 0;
		// Queue는 맨뒤의 요소를 반환하는 메소드가 없으므로 push명령에서 제일 마지막에 입력되는 수를 rear에 저장
		// back 명령어 입력시 저장된 rear값을 출력하도록 함.
		
		for (int i=0; i<n; i++) {
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str); // 문자열 쪼개서 저장
			command = st.nextToken();
			
			if (command.equals("push") && st.hasMoreTokens()) {
				int value = Integer.parseInt(st.nextToken());
				queue.add(value);
				rear = value;
			} else if (command.equals("front")) {
				if (!queue.isEmpty()) {
					bw.write(queue.peek() + "\n");
				} else {
					bw.write(-1 + "\n");
				}
			} else if (command.equals("back")) {
				if (!queue.isEmpty()) {
					bw.write(rear + "\n");
				} else {
					bw.write(-1 + "\n");
				}
			} else if (command.equals("pop")) {
				if (!queue.isEmpty()) {
					bw.write(queue.poll() + "\n");
				} else {
					bw.write(-1 + "\n");
				}
			} else if (command.equals("empty")) {
				if (queue.isEmpty()) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
			} else if (command.equals("size")) {
				bw.write(queue.size() + "\n");
			} else {
				System.exit(0);
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

