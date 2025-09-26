import shop.*;
public class find_price
{

    public static void main(String args[])
    {
        int sum = 0;
        fruits obj[] = new fruits[2];
        for(int i=0;i<2;i++)
        {
            obj[i] = new fruits();
        }

        for(int i = 0;i<2;i++)
        {
            obj[i].get_details();
        }

        for(int i = 0;i<2;i++)
        {
            int tot = obj[i].get_amt();
            System.out.println("The price of fruit " + (i+1) + " is " + tot);
            sum += tot;
        }
        System.out.println("The total sum is :" + sum );
    }   
}