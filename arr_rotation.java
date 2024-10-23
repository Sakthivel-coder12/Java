import java.util.Scanner;
class rotate
{
    int i,j;
    void printarr(int arr[],int m)
    {
        for(int n=0;n<m;n++)
        {
            System.out.println(arr[n]);
        }
    }
    void swap(int arr[],int q,int e,int b)
    {
        for(int i=0;i<b;i++)
        {
            int temp = arr[q+i];
            arr[q+i] = arr[e+i];
            arr[e+i] = temp;    
        }
    }
    void lrotate(int arr[],int n,int d)
    {
        d = d % n;
        if (d < 0) {
            d += n; 
        }
        if (d == 0) 
        {
            return; 
        }
        i=d;
        j=n-d;
        while(i!=j)
        {
            if(i<j)
            {
                swap(arr,d-i,d+j-i,i);
                j-=i;
            }
            else
            {
                swap(arr,d-i,d,i);
                i-=j;
            }
        }
        if(i==j)
        {
            swap(arr,d-i,d,i);
        }
    }
}
public class arr_rotation 
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = ni.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = ni.nextInt();
        }
        System.out.println("Enter number of elements that you want to rotate:");
        int d = ni.nextInt();
        rotate obj = new rotate();
        System.out.println("elements before rotation:");
        obj.printarr(arr, n);
        
        obj.lrotate(arr,n,d);
        System.out.println("The elements after the rotation:");
        obj.printarr(arr, n);
    }
    
}
