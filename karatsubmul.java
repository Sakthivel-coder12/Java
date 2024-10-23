import java.util.Scanner;

class karat
{
    long mul(long x,long y)
    {
        if(x<10 || y<10)
        {
            return x*y;
        }
        int n = Math.max(Long.toString(x).length(),Long.toString(y).length());
        int half = (n+1)/2;
        long a = x/(long) Math.pow(10,half);
        long b = x%(long) Math.pow(10,half);
        long c = y/(long) Math.pow(10,half);
        long d = y%(long) Math.pow(10,half);
        long ac = mul(a,c);
        long bd = mul(b,d);
        long adbc = mul(a+b,c+d)-ac-bd;
        return(long) (ac * Math.pow(10,2*half)+adbc * Math.pow(10,half)+bd);

    }
}
public class karatsubmul 	 
{
    public static void main(String argss[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the first number:");
        long a = ni.nextLong();
        System.out.println("Enter the second number:");
        long b = ni.nextLong();
        karat obj = new karat();
        long product = obj.mul(a,b);
        System.out.println("PRODUCT = " + product);
    }
}

