import java.util.*;
import java.io.*;
import java.net.*;
public class sum_server 
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket se = new ServerSocket(1400);
            Socket su = se.accept();
            InputStream ii = su.getInputStream();
            OutputStream oo = su.getOutputStream();
            DataInputStream in = new DataInputStream(ii);
            DataOutputStream out = new DataOutputStream(oo);

            int n = in.readInt();
            int sum = 0;
            for(int i = 0;i<n;i++)
            {
                sum += in.readInt();
            }

            out.writeInt(sum);

            out.close();
            in.close();
            oo.close();
            ii.close();
            su.close();
            se.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
