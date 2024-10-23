import java.util.*;
class booth
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the multiplicant:");
        long mulitplicant = ni.nextLong();
        System.out.println("Enter the multiplier:" );
        long multiplier = ni.nextLong();
        
        int bitsize = Math.max(Long.SIZE - Long.numberOfLeadingZeros(mulitplicant),Long.SIZE - Long.
        numberOfLeadingZeros(multiplier));

        long result = booth(mulitplicant,multiplier,bitsize);
        System.out.println("The product is : " + result);
    }
    public static long booth(long m,long r,int bitsize)
    {
        long x = m;
        long y = r;
        long z = 0;

        boolean isnegative = (x < 0)^(y < 0);

        x = Math.abs(x);
        y = Math.abs(y);

        for(int i = 0 ; i<bitsize;i++)
        {
            if((y &  1) == 1)
            {
                z += x;
            }
            x <<= 1;
            y >>= 1; 
        }
        return isnegative ? -z : z;
    }
}