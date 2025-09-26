import java.util.*;
public class lonseqflip 
{
    public static void main(String args[])
    {
        char ch;
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = ni.nextInt();
        
        String str = Integer.toBinaryString(n);
        int a[] = new int[str.length()];
        for(int i = 0;i<str.length();i++)
        {
            ch = str.charAt(i); 
            a[i] = ch - '0';
        }
        int k = 1,ze = 0,start = 0,max = 0;
        for(int i = 0;i<a.length-1;i++)
        {
            if(a[i]==0)
            {
                ze++;
            }
            while(ze>k)
            {
                if(a[start]==0)
                {
                    ze--;
                }
                start++;
            }
            max = Math.max(max,i-start+1);
        }
        System.out.println(max);
    }
}
