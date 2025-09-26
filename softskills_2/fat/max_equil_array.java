import java.util.*;
public class max_equil_array
{
    public static void main(String args[])
    {
        int arr[] = {5,2,1,1,3,2,3,4};
        int sum = 0,p_sum = 0,max = 0,index = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        for(int i = 0 ;i<arr.length;i++)
        {
            p_sum += arr[i];

            if(p_sum == sum)
            {
                if(p_sum > max)
                {
                    max = p_sum;
                    index = i;
                }
            }
            sum = sum - arr[i];
        }
        System.out.println(" Index = " + index + "\n max = " + max );
    }
}