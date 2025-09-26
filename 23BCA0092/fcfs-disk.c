#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,m,initial,totalheadmoment = 0;
    printf("Enter the no. cyclinder :");
    scanf("%d",&m);
    printf("Enter the number of requests :");
    scanf("%d",&n);
    int rq[n];
    for(int i = 0;i<n;i++)
    {
        scanf("%d",&rq[i]);
    }
    printf("Enter the initla :");
    scanf("%d",&initial);
    for(int i = 0;i<n;i++)
    {
        totalheadmoment = totalheadmoment + abs(rq[i] - initial);
        initial = rq[i];
    }
    printf("The total head moment %d :",totalheadmoment);
}
