import java.util.*;
class hour
{
    Scanner ni = new Scanner(System.in);
    int r,c;
    int max = Integer.MIN_VALUE;
    int sum = 0;
    int arr[][];
    void get()
    {
        System.out.println("Enter the number of rows");
        r = ni.nextInt();
        System.out.println("Enter the number of columns:");
        c = ni.nextInt();
        System.out.println("Enter the elements:");
        arr = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = ni.nextInt();
            }
        }
    }
    void max_sum()
    {
        for(int i=0;i<r-2;i++)
        {
            for(int j=0;j<c-2;j++)
            {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(max == 0 || sum > max )
                {
                    max = sum;
                }
            }
        }
        System.out.println("The maximum sum of the hour class is :" + max);
    }
}
public class max_hour_glass 
{
    public static void main(String args[])
    {
        hour ob = new hour();
        ob.get();
        ob.max_sum();
    }
    
}
