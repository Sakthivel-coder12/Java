import java.util.*;
import java.io.*;
import java.net.*;
public class date_client 
{
    public static void main(String args[])
    {
        try
        {
            Socket ss = new Socket("localhost",1300);
            InputStream in = ss.getInputStream();
            InputStreamReader ino = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ino);
            String date = br.readLine();

            System.out.println("The date is :" + date);
            ino.close();
            in.close();
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
