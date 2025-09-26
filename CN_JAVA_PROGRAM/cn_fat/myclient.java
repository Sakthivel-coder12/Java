import java.io.*;
import java.net.*;
import java.util.*;
public class myclient
{
    public static void main(String args[])
    {
        try
        {
            Scanner ni = new Scanner(System.in);
            Socket ss = new Socket("localhost",1500);
            OutputStream os = ss.getOutputStream();
            OutputStreamWriter osi = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osi);
            System.out.println("Enter the message you want send :");
            String str = ni.nextLine();
            bw.write(str);
            bw.flush();
            os.close();
            ss.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}