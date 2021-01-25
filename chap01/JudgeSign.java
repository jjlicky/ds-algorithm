import java.util.Scanner;

class JudgeSign
{
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.print("양수");
		else if(n<0)
			System.out.print("음수");
		else
			System.out.print("0");
	}
}