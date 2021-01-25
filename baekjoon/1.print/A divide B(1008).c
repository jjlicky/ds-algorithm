#include <stdio.h>

int main(void)
{
	
	int a, b;
	while (1)
	{
		scanf("%d %d", &a, &b);
		if (a > 0 && b < 10)
			break;
	}
	double res = (double)a / (double)b;
	printf("%.9lf\n", res);
	return 0;
}