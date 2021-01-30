import java.util.Scanner;

class SumOfArray
{
	
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("¿ä¼Ú¼ö : ");
		int num = stdIn.nextInt();

		int[] x = new int[num];

		for(int i=0; i<num; i++)
		{
			System.out.print("x["+ i + "] : ");
			x[i] = stdIn.nextInt();
		}
		int sum=0;
		for(int i=0; i<num; i++)
			sum+=x[i];
	
		System.out.println(sum);

	}
}