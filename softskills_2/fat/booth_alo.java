import java.util.*;
public class booth_alo
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        int multiplier = ni.nextInt();
        int multiplicant = ni.nextInt();
        int len = Integer.toBinaryString(multiplicant).length();
        int product = 0;
        for(int i = 0;i<len;i++)
        {
            int currentbit = (multiplicant & 0b1);
            
            if(currentbit == 1)
            {
                product += multiplier;
            }

            multiplier <<= 1;
            multiplicant >>>= 1;
        } 
        System.out.println("The multiplicant is : " + product);
    }
}