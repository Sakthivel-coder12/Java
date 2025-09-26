import java.util.*;
class euler_gcd
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the number two number for gcd :");
        int a = ni.nextInt();
        int b = ni.nextInt();
        if(a==0)
        {
            System.out.println("The gcd is :" + b);
        }
        else
        {
            while(a != 0)
            {
                int c = b % a;
                b = a;
                a = c;
                
            }
            System.out.println(" The gcd is : " + b);
        }
    }
}