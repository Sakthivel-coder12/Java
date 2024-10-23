import java.util.*;
public class majority 
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n = ni.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = ni.nextInt();
        }
        int count =0;
        int can = -1;
        for(int num : arr)
        {
            if(count == 0)
            {
                can = num;
            }
            else if(num == can)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        count = 0;
        for(int num : arr)
        {
            if(num == can)
            {
                count++;
            }
        }

        if( count > (n/2))
        {
            System.out.println("The majority of the element is : " + can);
        }
        else
        {
            System.out.println("There is no majority elements :");
        }
    }    
}
