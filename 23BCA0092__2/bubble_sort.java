import java.util.*;
interface input
{
    void sort();
}
class order implements input
{
    public void sort()
    {
        int arr[]  = {2,3,-1,8,28};
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        for(int i = 0;i < n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
public class bubble_sort
{
    public static void main(String args[])
    {
        order o = new order();
        o.sort();
    }
}