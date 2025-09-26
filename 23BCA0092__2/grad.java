import java.util.*;
class person
{
    Scanner ni = new Scanner(System.in);
    String name,course_name;
    int regno;
    void get_personal()
    {
        name = ni.next();
        course_name = ni.next();
        regno = ni.nextInt();
    }
}
class student extends person
{
    int n,sum = 0;
    void get_mark()
    {
        System.out.println("Enter the no. of subjects :");
        n = ni.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0;i<n;i++)
        {
            arr[i] = ni.nextInt();
            sum += arr[i];
        
        }
    }
    void cla()
    {
        float avg = sum/n;
        if(avg > 90)
        {
            System.out.println("s grade");

        }
        else
        {
            System.out.println(" A grade ");
        }
    }
}
public class grad
{
    public static void main(String args[])
    {
        student s = new student();
        s.get_personal();
        s.get_mark();
        s.cla();
    }
}