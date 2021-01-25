import java.util.Scanner;

class SumWhile
{
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);

		System.out.print("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 입력 : ");

		int n = stdIn.nextInt();
		
		int sum=0;
		int i=1;

		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);

	}
}