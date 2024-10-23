import java.util.*;
class binarypalin
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        int x = ni.nextInt();
        int rev = 0 ;
        int ori = x;
        while(x != 0)
        {
            rev <<= 1;
            rev |= (x & 1);
            x >>= 1;
        }
        if(rev == ori)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}