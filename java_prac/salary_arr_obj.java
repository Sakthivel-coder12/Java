import java.util.*;
class emp
{
    int bas;
    int hra;
    int da;
    int gross_income = 0;
    void get(int bs,int h,int d)
    {
        bas = bs;
        hra = h;
        da = d;
    }
    int compute()
    {
        if(bas > 10000)
        {
            hra = (int) (bas*(hra/100.0));
            da = (int) (bas*(da/100.0));
            gross_income = bas + hra + da;
        }
        else if(bas < 10000)
        {
            hra = (int) (bas*(hra/100.0));
            da = (int) (bas*(da/100.0));
            gross_income = bas + hra + da;
        }
        return gross_income;
    }
}
public class salary_arr_obj
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter for number of employees you want to create and details:");
        int n = ni.nextInt();
        
        emp obj[] = new emp[n];
        for(int i = 0;i<n;i++)
        {
            obj[i] = new emp();
        }
        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter the basic salary: hra : da: (percentage)");
            int bs = ni.nextInt();
            int h = ni.nextInt();
            int d = ni.nextInt();
            obj[i].get(bs,h,d);
            int ans =obj[i].compute();
            System.out.println("The salary is " + ans);
        }
    }
}
