

class Digits
{
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("2자리 정수를 입력하세요.");
		
		do{
			System.out.print("입력 : ");
			n = stdIn.nextInt();
		}while(n<10 || n>99);
		
		System.out.println(n);

	}
}