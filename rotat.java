import java.util.Scanner;
public class rotat 
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
        System.out.println("Elements before roatation:");
        for(int j=0;j<n;j++)
        {
            System.out.println(arr[j]);
        }
        System.out.println("Enter the number of rotation :");
        int d = ni.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = arr[i];
        }
        int f = n-d;
        int k =0;
        for(int i = 0;i<f;i++)
        {
            arr[i] = arr[d++];
        }
        int a =0;
        for(int i=f;i<n;i++)
        {
            arr[i] = arr1[a++];
        }
        System.out.println("Elements after the rotation:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
