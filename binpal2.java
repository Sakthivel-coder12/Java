import java.util.*;
public class binpal2 
{
    public static boolean gcd(int r)
    {
        String str = Integer.toBinaryString(r);
        int i = 0,j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String argss[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = ni.nextInt();
        
        boolean st = gcd(x);
        System.out.println(st);
    }
}
