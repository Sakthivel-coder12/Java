import java.util.*;
class prime
{
    public static void main(String argss[])
    {
        Scanner ni = new Scanner(System.in);
        int n = ni.nextInt();
        boolean isprime = true;
        if(n < 1)
        {
            isprime = false;
        }
        else if(n == 2)
        {
            isprime = true;
        }
        else
        {
            double limit = Math.sqrt(n);
            for(int i = 2;i<limit;i++)
            {
                if(n % i == 0)
                {
                    isprime = false;
                }
            }
        }
        if(isprime)
        {
            System.out.println("The number is prime:");
        }
        else
        {
            System.out.println("The number is not prime:");
        }
    }
}