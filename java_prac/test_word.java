import java.util.Scanner;

import dict.*;
public class test_word
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        list o[] = new list[2];
        for(int i = 0;i<2;i++)
        {
            o[i] = new list();
        }
        for(int i = 0;i<2;i++)
        {
            o[i].get_words();
        }

        System.out.println("Enter the word that you want to search: ");
        String str = ni.next();
        String ss = "";
        for(int i = 0;i<2;i++)
        {
            ss = o[i].search(str);
        }
        System.out.println("The founded value is :" + ss);
    }
}