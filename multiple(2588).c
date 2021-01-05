#include <stdio.h>

int main(void)
{
	
	int a, b;
	scanf("%d %d", &a, &b);
	
	int di1 = (b / 100);
	int di2 = (b%100)/10 ;
	int di3 = (b%100)%10;
	int di[3] = {di3,di2,di1};
	
	int res = a * b;
	int i;
	for (i = 0; i < 3; i++)
	{
		printf("%d\n", a*di[i]);
		
	}
	printf("%d\n",res);
	return 0;
}