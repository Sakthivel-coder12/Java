#include<stdio.h>
int main()
{
    int n,m;
    printf("Enter the number of size of memory :");
    scanf("%d",&n);
    printf("Enter the number of processes :");
    scanf("%d",&m);
    int size[n],pro[m];
    printf("Enter the sequence of sizes :");
    for(int i = 0;i<n;i++)
    {
        scanf("%d",&size[i]);
    }
    for(int j = 0;j<m;j++)
    {
        scanf("%d",&pro[j]);
    }
    int x,y,flag;
    for(int i = 0;i<m;i++)
    {
        flag = 0;
        for(int j =0;j<n;j++)
        {
            if(size[j]>=pro[i])
            {
                flag = 1;
                x = size[j];
                size[j] = size[j] - pro[i];
                y = size[j];
                break;
            }
        }
        if(flag == 1)
        {
            printf("process = %d , allocated  = %d , remaining = %d\n",pro[i],x,y);
        }
        else
        {
            printf("process = %d there is no space to allocate it :",pro[i]);
        }
    }
    return 0;
}
