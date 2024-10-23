import java.util.Scanner;
public class sub_max
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = ni.nextInt();
        int l=0;
        int max = 0;
        int arr[] = new int[n];
        int arr1[] = new int[100];
        for(int i=0;i<n;i++)                
        {
            arr[i] = ni.nextInt();
        }
    
        for(int i = 1;i<n;i++)
        {
            
            for(int j=0;j<=n-i;j++)
            {
                int mul = 1;
                for(int k=j;k<j+i;k++)
                {
                    mul*=arr[k];
                    if(max == 0|| max < mul)
                    {
                        max=mul;
                    }
                }
                arr1[l++] = mul;
            }
        }
        System.out.println("The maximum element is :" + max + "\n\n");
        for(int i = 0;i<l;i++)
        {
            System.out.println(arr1[i] + " ");
        }

    }
}