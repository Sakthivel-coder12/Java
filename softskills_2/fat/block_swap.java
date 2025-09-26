import java.util.*;
public class block_swap
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int size = arr.length-1;
        System.out.println("Enter the number of rotation : ");
        int n = ni.nextInt();
        n = n % size;
        for(int i= 0;i<n;i++)
        {
            int f = arr[0];
            for(int j = 0;j<size;j++)
            {
                arr[j] = arr[j+1];
            }
            arr[size] = f;
        }

        for(int i = 0;i<=size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}