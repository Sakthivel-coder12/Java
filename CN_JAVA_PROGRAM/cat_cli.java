import java.util.*;
import java.io.*;
import java.net.*;
public class cat_cli
{
    public static void main(String args[])
    {
        try
        {
            Socket su = new Socket("localhost",1234);
            OutputStream os = su.getOutputStream();
            OutputStreamWriter osi = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osi);
            bw.write("hello \n");


            bw.flush();

            InputStream in = su.getInputStream();
            InputStreamReader re = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(re);

            String str2 = br.readLine();
            System.out.println("The date is :" + str2);

            re.close();
            in.close();
            osi.close();
            os.close();
            su.close();


        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}