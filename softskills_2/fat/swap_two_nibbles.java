import java.util.*;
public class swap_two_nibbles
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = ni.nextInt();
        
        n = ((n & 0x0F) << 4 | (n & 0xF0) >> 4);

        System.out.println("The value after swap is :" + n);
    }
}