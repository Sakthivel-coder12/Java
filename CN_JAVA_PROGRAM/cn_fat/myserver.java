import java.util.*;
import java.net.*;
import java.io.*;
public class myserver 
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket si = new ServerSocket(1500);
            Socket sw = si.accept();
            InputStream in = sw.getInputStream();
            InputStreamReader re = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(re);
            String str1 = br.readLine();

            System.out.println(str1);
            re.close();
            sw.close();
            si.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }    
}
