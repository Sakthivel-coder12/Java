import java.util.*;
public class binpal3 
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = ni.nextInt();
        String str = Integer.toBinaryString(n);
        String str1 = "";
        for(int i = str.length()-1; i >= 0;i--)
        {
            str1 += str.charAt(i);
        }    
        if(str.equals(str1))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("flase");
        }
    }
}
