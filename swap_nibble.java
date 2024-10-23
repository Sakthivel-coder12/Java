import java.util.*;
public class swap_nibble 
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        int x = ni.nextInt();
        x = ((x & 0xF0)>>4) | ((x & 0x0F)<<4);
        System.out.println(x);
    }
}
