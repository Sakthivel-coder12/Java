import java.util.*;
class gcd_fun
{
    public static int find_gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return find_gcd(b, b % a);
    }

    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the number two number for gcd :");
        int x = ni.nextInt();
        int y = ni.nextInt();
        System.out.println("The gcd is :" + find_gcd(x,y));
    }
}