import java.util.*;
class bank
{
    Scanner ni = new Scanner(System.in);
    String cust_name;
    int cust_acc_no;
    int balance;
    void init(String a,int no,int bal)
    {
        cust_name = a;
        cust_acc_no = no;
        balance = bal;
    }
}
class savings_account extends bank
{
    int dep,with;
    void deposit()
    {
        System.out.println("Enter the amount that you want to deposite:");
        dep = ni.nextInt();
        balance += dep;
    }
    void withdraw()
    {
        System.out.println("Enter the amount that you wnat to withdrawl");
        with = ni.nextInt();
        if(balance > 500)
        {
            balance -= with;
            System.out.println("The amount withdrawed successfully and the balance is " + balance);
        }
        else
        {
            System.out.println("you have only minimum balance only WITHDRAWAL NOT POSSIBLE :");
        }
    }
}
public class bank_mag
{
    public static void main(String args[])
    {
        savings_account obj = new savings_account();
        obj.init("Nithiya",1318,5000);
        obj.deposit();
        obj.withdraw();
    }
}