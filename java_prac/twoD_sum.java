import java.util.*;
class matrix
{
    Scanner ni = new Scanner(System.in);
    int two_dim[][] = new int[3][3];
    void get_read()
    {
        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                two_dim[i][j] = ni.nextInt();
            }
        }
    }
}
class manipulation extends matrix
{
    int tot = 0;
    void sum()
    {
        for(int i=0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                tot += two_dim[i][j];
            }
        }
    }
    void disp()
    {
        System.out.println("The sum is :" + tot);
    }
}
public class twoD_sum
{
    public static void main(String args[])
    {
        manipulation obj = new manipulation();
        obj.get_read();
        obj.sum();
        obj.disp();
    }
}