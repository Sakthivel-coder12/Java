package numbers;
import java.util.*;
public class large
{
    int n1,n2,n3;
    Scanner ni = new Scanner(System.in);
    public void get_numbers()
    {
        System.out.println("Enter the three numberrs :");
        n1 = ni.nextInt();
        n2 = ni.nextInt();
        n3 = ni.nextInt();
    }
    public void display_largest()
    {
        if(n1 > n2 && n1 > n2)
        {
            System.out.println("The largest number is " + n1);
        }
        else if(n2 > n1 && n2 > n3)
        {
            System.out.println("The largest number is " + n2);
        }
        else
        {
            System.out.println("The largest number is " + n3);
        }
    }
}