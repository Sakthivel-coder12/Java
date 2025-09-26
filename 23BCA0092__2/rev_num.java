import java.util.*;
public class rev_num
{
    public static void main(String[] args) 
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the number :");

        int n = ni.nextInt();

        int rem,res = 0;
        while(n>0)
        {
            rem = n % 10;
            res = (res*10) + rem;
            n /= 10;
        }
        System.out.println(res);
    }
}