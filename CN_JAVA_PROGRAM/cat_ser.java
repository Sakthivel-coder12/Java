import java.util.*;
import java.io.*;
import java.net.*;
public class cat_ser
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss = new ServerSocket(1234);
            Socket si = ss.accept();
            InputStream in = si.getInputStream();
            InputStreamReader nii = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(nii);

            String str = br.readLine();
            String tr = str.trim();
            System.out.println("The received message is :" + tr);

            OutputStream out = si.getOutputStream();
            OutputStreamWriter osi = new OutputStreamWriter(out);
            BufferedWriter bw = new BufferedWriter(osi);
            Date d = new Date();
            String dd = d.toString();
            System.out.println(dd);

            bw.write(dd + "\n");
            bw.flush();
            nii.close();
            in.close();
            si.close();
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}