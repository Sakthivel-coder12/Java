    import java.util.*;
    public class lex_str
    {
        public static void main(String args[])
        {
            int max_al = 26;
            Scanner ni = new Scanner(System.in);
            System.out.println("Enter the String :");
            String str = ni.next();
            int fre[] = new int[max_al];
            int n = str.length();
            boolean ispalin = true;

            for(int i = 0 ; i<n;i++)
            {
                fre[str.charAt(i) - 'a']++;
            }
            int odd_count = 0;
            for(int i = 0;i<max_al;i++)
            {
                if(fre[i] % 2 != 0)
                {
                    odd_count++;
                }
            }
            if((n % 2 == 0 && odd_count > 0) || (n % 2 != 0 && odd_count != 1))
            {
                ispalin = false;
            }

            String odd_str = "";
            if(odd_count == 1)
            {
                for(int i = 0;i< max_al ; i++)
                {
                    if(fre[i] % 2 != 0)
                    {
                        fre[i]--;
                        odd_str = odd_str + (char) (i + 'a');
                        break;
                    }
                }
            }

            String f_str = "",r_str = "";
            for(int i = 0; i<max_al;i++)
            {
                if(fre[i]!=0)
                {
                    char ch = (char) (i + 'a');
                    String temp = "";
                    for(int j = 0;j< fre[i]/2;j++)
                    {
                        temp = temp + ch;
                    }
                    f_str = f_str + temp;
                    r_str = temp + r_str;
                }
            }
            if(ispalin)
            {
                System.out.println(f_str + odd_str + r_str);
            }
            else
            {
                System.out.println("Not a palindromic String :");
            }

        }
    }