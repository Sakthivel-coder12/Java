package shop;
import java.util.*;
public class fruits
{
    Scanner ni = new Scanner(System.in);
    String f_name,color,shap;
    int price,quan;
    public void get_details()
    {
        f_name = ni.next();
        color = ni.next();
        shap = ni.next();
        price = ni.nextInt();
        quan = ni.nextInt();
    }
    public int get_amt()
    {
        return price*quan;
    }
}