import java.util.*;
class sieve_eratosthenes
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        int n  = ni.nextInt();
        boolean boll[] = new boolean[n + 1];
        Arrays.fill(boll,true);
        for(int i = 2;i<Math.sqrt(n);i++)
        {
            if(boll[i] == true)
            {
                for(int j = (i*i);j<n;j = j = j + i)
                {
                    boll[j] = false;
                }
            }
        }
        for(int i = 2;i<n;i++)
        {
            if(boll[i] == true)
            {
                System.out.println(i);
            }
        }
    }
}
