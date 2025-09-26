import java.util.*;
public class prime_num
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = ni.nextInt();
        boolean isprime = false;
        if(n == 2)
        {
            isprime = true;
        }
        else if(n<1)
        {
            isprime = false;
        }
        else
        {
            double limit = Math.sqrt(n);
            for(int i = 3;i<limit;i++)
            {
                if(n % i == 0)
                {
                    isprime = false;
                }
            }
        }
        if(isprime)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println(" not prime");
        }
    }
}