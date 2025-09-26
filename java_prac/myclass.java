import packnew.*;
public class myclass implements circle
{
    public void find()
    {
        System.out.println("The area of the cirlce is :" + 3.14 * (Math.pow(2,2)));
    }

    public static void main(String args[])
    {
        myclass obj = new myclass();
        obj.find();
    }
}
