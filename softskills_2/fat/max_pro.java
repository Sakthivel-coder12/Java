import java.util.*;
public class max_pro
{
    public static void main(String args[])
    {
        int arr[] = {2,4,0,-2,1};
        int n = arr.length;
        int max = arr[0], min = arr[0],m = arr[0],temp = 0;
        for(int i = 1;i<n ;i++)
        {
            if(arr[i]>0)
            {
                max = Math.max(arr[i],max * arr[i]);
                min = Math.min(arr[i],min * arr[i]);
            }
            else if(arr[i] == 0)
            {
                min = max = 0;
            }
            else
            {
                temp = max;
                max = Math.max(arr[i],min * arr[i]);
                min = Math.min(arr[i],temp * arr[i]);
            }
            m = Math.max(m,max);

        }
        System.out.println(m);
    }
}