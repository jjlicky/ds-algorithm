package bj_algorithm;

public class function_SelfNum {
	
	static int dn(int x) {
		
		int res=0;
		int sum=0;
		int div=x;
		
		while(true) {
			res = div%10;
			div/=10;
			sum+=res;
			if(div==0)
				return sum+x; 
		}
	}
	
	public static void main(String[] args) {
		
		int n=10000;
		boolean [] check = new boolean[10001]; // 기본값이 false
		int k;
		
		for(int i=1;i<=n;i++) {
			if(!check[i]) {
				k=i;		// k=1로 해버리면 1부터시작해서 생성자의 생성자만 찾아버리므로 오답
				while(k<10000) {
					k=dn(k);
					check[k]=true;
				}
				System.out.println(i);
			}
		}
	}
}
