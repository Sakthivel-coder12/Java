import java.util.*;
public class remove_ele
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n = ni.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = ni.nextInt();
        }
        System.out.print("Enter the position of the element want to remove:");
        int pos = ni.nextInt();
        for(int i = pos-1 ; i<n-1;i++)
        {
            arr[i] = arr[i+1];
        }
        System.out.println("After removing the element :");
        for(int i = 0; i<arr.length - 1; i++)
        {
            System.out.println(arr[i]);
        }
    }
}