package numbers;

import java.util.*;
public class large
{
    int a,b,c;
    public void get_numbers()
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        a = ni.nextInt();
        b = ni.nextInt();
        c = ni.nextInt();
    }
    public void display_largest()
    {
        if(a > b && a > c)
        {
            System.out.println("The big number is " + a);
        }
        else if(b > a && b > c)
        {
            System.out.println("The big number is " + b);
        }
        else
        {
            System.out.println("The big number is " + c);
        }
    }
}