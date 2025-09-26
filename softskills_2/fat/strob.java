import java.util.*;
public class strob
{
    public static void main(String argss[])
    {
        Scanner ni = new Scanner(System.in);
        Map<Character,Character> saga= new HashMap<>();
        System.out.println("Enter the digit : ");
        int dig = ni.nextInt();
        int start = (int) Math.pow(10,dig - 1);
        int end = (int) Math.pow(10,dig);
        if(dig == 1)
        {
            start = 0;
        }
        saga.put('6','9');
        saga.put('9','6');
        saga.put('8','8');
        saga.put('0','0');
        saga.put('1','1');
        for(int i = start;i<end;i++)
        {
            String n = Integer.toString(i);
            int l = 0 , r = n.length() - 1;
            boolean isstro = true;
            while(l<=r)
            {
                if(!saga.containsKey(n.charAt(l)) || saga.get(n.charAt(l)) != n.charAt(r))
                {
                    isstro = false;
                    break;
                }
                l++;
                r--;
            }
            if(isstro)
            {
                System.out.println("The strob : " + n);
            }
        }
    }
}