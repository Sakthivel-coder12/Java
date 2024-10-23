import java.util.*;
public class rev_str 
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.print("Enter the String to reverse : " );
        String str = ni.next();

        StringBuilder n = new StringBuilder();
        n.append(str);
        n.reverse();

        System.out.println("reverse using StringBulider :" + n);

        StringBuffer  nn = new StringBuffer(str);
        nn.reverse();

        System.out.println("reverse using StringBuffer :" + nn);
    }
}
