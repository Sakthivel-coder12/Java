import java.util.*;
public class eucli2 {
    public static void main(String args[])
    {
        Scanner ni  = new Scanner(System.in);
        int a = ni.nextInt();
        int b = ni.nextInt();
        if(a==0)
        {
            System.out.println("The gcd is  :" + b);
        }
        else
        {
            while(a!=0)
            {
                int c = b % a;
                b = a;
                a = c;
            }
            System.out.println("The gcd is :" + b);
        }
    }
}
