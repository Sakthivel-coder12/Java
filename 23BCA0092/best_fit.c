#include<stdio.h>
int main()
{
    int n,m;
    printf("Enter the number of sizes :");
    scanf("%d",&n);
    printf("Enter the number of process :");
    scanf("%d",&m);
    int size[n],pro[m],index,x,y;
    printf("Enter the size:");
    for(int i = 0;i<n;i++)
    {
        scanf("%d",&size[i]);
    }
    printf("Enter the process :");
    for(int j = 0;j<m;j++)
    {
        scanf("%d",&pro[j]);
    }

    for(int i =0;i<m;i++)
    {
        index = -1;
        for(int j = 0;j<n;j++)
        {
            if(size[j]>=pro[i])
            {
                if(index == -1)
                {
                    index = j;
                }
                else if(size[index]>size[j])
                {
                    index = j;
                }
            }
        }
        if(index != -1)
        {
            x=size[index];
            size[index] = size[index] - pro[i];
            y = size[index];
            printf("\nprocess = %d , allocated = %d , remaining = %d",pro[i],x,y);
        }
        else
        {
            printf("\nprocess = %d , not allocated ",pro[i]);
        }
    }
}
