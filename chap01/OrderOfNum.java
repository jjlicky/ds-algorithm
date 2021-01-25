import java.util.Scanner;

class OrderOfNum
{
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("입력한 숫자의 자릿수를 구합니다...");
		System.out.print("n의 값 입력 : ");
		n = stdIn.nextInt();
		int a=0;
		while(n!=0)
		{
			n/=10;
			a++;
		}
		
		System.out.println(a);

	}
}