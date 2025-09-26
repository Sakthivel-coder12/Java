import sum_series.*;
class find_xx extends compute
{
    int sum = 0,x;
    public void find()
    {
        compute c = new compute();
        int x = c.read();
        System.out.println(x);
        for(int i=1; i <=x; i++)
        {
            sum += Math.pow(i,2);
        }
        System.out.println("The sum of the power series is :" + sum);
    }
}
public class find_sum
{
    public static void main(String args[])
    {
        find_xx i = new find_xx();
        i.find();
    }
}