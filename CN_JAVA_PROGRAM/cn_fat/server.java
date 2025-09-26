import java.util.*;
import java.io.*;
import java.net.*;
public class server
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("The server is connecting");
            ServerSocket ser = new ServerSocket(1200);
            Socket si = ser.accept();
            System.out.println("Connection estabblished");
            InputStream in = si.getInputStream();
            InputStreamReader su = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(su);
            String str = br.readLine();
            System.out.println("The received mesg is :" + str);

            OutputStream out = si.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out);
            BufferedWriter bs = new BufferedWriter(osw);
            Date d = new Date();
            String date = d.toString();
            bs.write(date + "\n");
            bs.flush();
            osw.close();
            out.close();
            br.close();
            su.close();
            in.close();
            si.close();
            ser.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
 