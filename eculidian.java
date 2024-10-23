import java.util.*;
public class eculidian 
{
    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args) 
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int x = ni.nextInt();
        System.out.println("Enter the number 2:");
        int y  = ni.nextInt();
        int res = gcd(x,y);
        System.out.println("The gcd is :" + res);
    }
}
