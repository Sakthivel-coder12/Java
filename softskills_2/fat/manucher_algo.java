import java.util.*;
public class manucher_algo
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        String str = ni.next();
        String longest = "";

        for(int i = 0;i<str.length();i++)
        {
            for(int j =i+1;j<=str.length();j++)
            {
                String sub = str.substring(i,j);
                
                String rev = new StringBuilder(sub).reverse().toString();
                boolean isplain = rev.equals(sub);

                if(isplain && sub.length() > longest.length())
                {
                    longest = sub;
                }
            }
        }
        System.out.println(longest);
    }
}