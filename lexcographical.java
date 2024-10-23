import java.util.*;
class lexcographical
{

    final static int max_num = 26;

    public static void comfre(String str,int fre[],int len)
    {
        for(int i = 0; i<len;i++)
        {
            fre[str.charAt(i) - 'a']++;
        }
    }
    public static boolean palindrome(int fre[],int len)
    {
        int odd_count = 0;
        for(int i = 0;i<max_num;i++)
        {
            if(fre[i] % 2 != 0)
            {
                odd_count++;
            }
        }

        if(len%2==0)
        {
            return odd_count == 0;
        }

        return odd_count == 1;
    }

    public static String odd_check(int fre[])
    {
        String odd_str = "";

        for(int i = 0;i<max_num;i++)
        {
            if(fre[i]%2 != 0)
            {
                fre[i]--;
                odd_str = odd_str + (char) (i + 'a');
                return odd_str;
            }
        }
        return odd_str;
    }
    public static String lexco(String str)
    {
        int len = str.length();
        int fre[] = new int[max_num];
        comfre(str,fre,len);

        if(!(palindrome(fre,len)))
        {
            System.out.println("Not a palindrome:");
        }

        String odd_str1 = odd_check(fre);
        String fornt_str = "", rear = "";
        for(int i = 0;i<max_num;i++)
        {
            String temp = "";
            if(fre[i] != 0)
            {
                char ch = (char) (i + 'a');
                for(int j = 1;j <= fre[i]/2 ;j++)
                {
                    temp = temp + ch;   
                }
                fornt_str  = fornt_str + temp;
                rear = temp + rear;
            }
        }
        return (fornt_str + odd_str1 + rear);
    }
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = ni.next();
        String ans = lexco(str);
        System.out.println("The lexographical is :" + ans);
    }
}
