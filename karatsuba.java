import java.util.*;
public class karatsuba 
{
    public static long mul(long x,long y)
    {
        if(x < 10 || y < 10)
        {
            return (x*y);
        }
        int n = Math.max(Long.toString(x).length(),Long.toString(y).length());
        int half = (n+1)/2;
        long a = x/(long) Math.pow(10,half);
        long b = x%(long) Math.pow(10,half);
        long c = y/(long) Math.pow(10,half);
        long d = y%(long) Math.pow(10,half);
        long ac = mul(a,c);
        long bd = mul(b,d);
        long acbd = mul(a+b,c+d)-ac-bd;
        return(long) (ac * Math.pow(10,2*half)+ acbd * Math.pow(10,half) + bd);
    }
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        long x = ni.nextLong();
        long y = ni.nextLong();
        long res = mul(x,y);
        System.out.println("The product is :" + res);
    }    
}
