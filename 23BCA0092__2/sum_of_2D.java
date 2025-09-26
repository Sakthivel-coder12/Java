import java.util.*;
class matrix
{
    Scanner ni = new Scanner(System.in);
    int two_arr[][] = new int[3][3];
    int sum = 0;
    void get()
    {
        System.out.println("Enter the  elements :");
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                two_arr[i][j] = ni.nextInt();
            }

        }
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                sum += two_arr[i][j];
            }
        }
        
    }
    void transponse()
    {
        System.out.println("The sum is :" + sum);
    }
}
public class sum_of_2D
{
    public static void main(String args[])
    {
        matrix m  = new matrix();
        m.get();
        m.transponse();
    }
}