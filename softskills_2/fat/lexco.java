import java.util.*;
public class lexco
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = ni.next();
        int freq[] = new int[26];
        StringBuilder half = new StringBuilder();
        StringBuilder oddchar = new StringBuilder();
        
        for(int c : str.toCharArray())
        {
            freq[c - 'a']++;
        }

        for(int i = 0;i<26;i++)
        {
            char ch = (char) (i + 'a');
            if(freq[i]%2 != 0)
            {
                oddchar.append(ch);
            }
            half.append(String.valueOf(ch).repeat(freq[i]/2));
        }

        if(oddchar.length() > 1)
        {
            System.out.println("NO PALINDROMIC STRING :");
        }
        else
        {
            StringBuilder palindromicstring = new StringBuilder(half);
            String res = palindromicstring.toString() + oddchar.toString() + palindromicstring.reverse().toString();
            System.out.println("The lexicographical palindromic String is :  " + res);   
        }
    }
}