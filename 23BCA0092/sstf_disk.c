#include<stdio.h>
#include<stdlib.h>

int main()
{
    int rq[100],n,m,initial,totalheadmoment = 0;
    printf("Enter the no. cyclinder :");
    scanf("%d",&m);
    printf("Enter the number of requests :");
    scanf("%d",&n);
    for(int i = 0;i<n;i++)
    {
        scanf("%d",&rq[i]);
    }
    printf("Enter the initial :");
    scanf("%d",&initial);
    int count = 0;
    while(count != n)
    {
        int min = 1000,d,index;

        for(int i = 0;i<n;i++)
        {
            d = abs(rq[i] - initial);
            if(min > d)
            {
                min = d;
                index = i;
            }

        }
        totalheadmoment = totalheadmoment + min;
        initial = rq[index];
        rq[index] = 1000;
        count++;
    }


}
