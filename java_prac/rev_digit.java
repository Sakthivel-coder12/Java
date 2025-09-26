import java.util.*;
public class rev_digit
{
    public static void main(String argss[])
    {
        Scanner ni = new Scanner(System.in);
        int n = ni.nextInt();
        int rem, rev = 0;
        while(n != 0)
        {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        System.out.println("The reverse of the number is : " + rev);
    }
}