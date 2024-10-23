import java.util.*;
public class add_ele 
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.print("Ente the number of elements:");
        int n = ni.nextInt();
        int arr[] = new int[n+1];
        for(int i = 0 ; i<n; i++)
        {
            arr[i] = ni.nextInt();
        }
        System.out.println("Enter the position that you want to add an element: ");
        int pos =ni.nextInt();
        System.out.print("Enter the element that you want to insert:");
        int ele = ni.nextInt();
        for(int i = n;i>=pos;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos-1] = ele;
        for(int i = 0 ; i <= n ;i++)
        {
            System.out.println(arr[i]);
        }
    }    
}
