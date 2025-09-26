import java.util.*;
class myexception extends Exception
{
    myexception(String str)
    {
        super(str);
    }
}
public class product
{
    int productcheck(int weight)
    {
        try
        {
            if(weight<100)
            {
                throw new myexception("product invalid:");
            }   
            else
            {   
                return weight;     
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        product p = new product();
        int nn = p.productcheck(ni.nextInt());
        System.out.println(nn);
    }
}