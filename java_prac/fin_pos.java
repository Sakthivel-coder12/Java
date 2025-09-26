import java.util.*;
public class fin_pos
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        int max = 0;
        while(true)
        {
            System.out.println("Enter the digit");
            int n = ni.nextInt();
            max = Math.max(max,n);
            System.out.println("Do you want to continue :");
            char ch = ni.next().charAt(0);
            if(ch == 'y' || ch == 'Y')
            {
                continue;
            }
            else if(ch == 'n' || ch == 'N')
            {
                break;
            }
        }
        System.out.println("The maximum is  :" + max);
        
    }
}