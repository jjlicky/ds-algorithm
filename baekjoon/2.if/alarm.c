#include <stdio.h>

int main(void)
{
	
	int H, M;
	while (1)
	{
	scanf("%d %d", &H, &M);
	if ((0 <= H <= 23) && (0 <= M <= 59))
		break;
	}
	int trans = H * 60 + M - 45;
	H = trans / 60;
	M = trans - H * 60;
	
	if (M < 0)
	{
		H += 23;
		M += 60;
	}
	else;

	printf("%d %d", H, M);

	return 0;
}