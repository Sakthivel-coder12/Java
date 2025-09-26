import java.util.*;
class permutation
{
    public static void main(String argss[])
    {
        Scanner ni = new Scanner(System.in);
        String str = ni.next();

        char s[] = str.toCharArray();

        int n = s.length;

        Arrays.sort(s);

        while(true)
        {
            System.out.println(new String(s));
            int i = n - 2;
            while(i >= 0 && s[i] >= s[i+1])
            {
                i--;
            }
            if(i<0)
            {
                break;
            }
            
            int j= n-1;
            while(s[j] <= s[i])
            {
                j--;
            }

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;


            int start = i+1,end=n-1;
            while(start < end)
            {
                temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
            }
        }
    }
}