package hicreate;
import java.util.Scanner;

public class RandomGame {

	public static void main(String arg[]) {
		
		int random_trans;
		double random;
		int a;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1~50사이의 수를 입력하세요");
		a = scan.nextInt();
		random = Math.random();
		random_trans = (int)((random*50)+1);
		
		if(a<1) {
			System.out.println("잘못 입력하셨습니다.");
		}else if(a>50) {
			System.out.println("잘못 입력하셨습니다.");
		}else if(a>random_trans) {
			System.out.println("다운");
		}else if(a<random_trans) {
			System.out.println("업");
		}else {
			System.out.println("정답");
		}
		System.out.println("랜덤으로 뽑힌 숫자는" + random_trans + "입니다.");
	}
}