import java.util.*;
public class max_equii 
{
    public static void main(String argss[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = ni.nextInt();
        int arr[] = new int[n];
        int tot=0,l=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i] = ni.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            tot += arr[i];
        }
        for(int j =0;j<n;j++)
        {
            l += arr[j];
            if(l == tot && l>max)
            {
                max = l;
            }
            tot -=arr[j];
        }
        if(max == Integer.MIN_VALUE)
        {
            System.out.println("There is no equilibrium element in these array: ");  
        }
        else
        {
            System.out.println("The maximum sum of the equilibrium is :" + max);  
        }  

        
    }
    
}

