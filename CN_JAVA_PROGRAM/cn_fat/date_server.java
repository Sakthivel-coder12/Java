import java.util.*;
import java.io.*;
import java.net.*;
public class date_server
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket si = new ServerSocket(1300);
            Socket ss = si.accept();
            OutputStream os = ss.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            Date d = new Date();
            String str = d.toString();

            bw.write(str);

            bw.flush();
            osw.close();
            os.close();
            ss.close();
            si.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
