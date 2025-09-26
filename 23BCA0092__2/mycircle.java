import packnew.*;
import java.util.*;
class mycircle implements circle
{
    Scanner nn = new Scanner(System.in);
    int r;
    public void find()
    {
        System.out.println("Enter the radius of the circle:");
        r = nn.nextInt();
        System.out.println("The area of the circle is " + (3.14*(Math.pow(r,2))));
    }

    public static void main(String args[])
    {
        mycircle obj = new mycircle();
        obj.find();
    }
}
