import java.util.*;
import java.net.*;
import java.io.*;
public class decode_ser 
{
    public static void main(String args[])
    {
        try
        {
            Scanner ni = new Scanner(System.in);
            ServerSocket ii = new ServerSocket(2834);
            Socket su = ii.accept();
            InputStream in = su.getInputStream();
            InputStreamReader ind = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ind);

            String st = br.readLine();
            String str2 = st.trim();
            String de = "";
            for(int i = 0;i<str2.length();i++)
            {
                char chh = str2.charAt(i);
                int assi = (int) chh;
                int m = assi - 2;
                de += (char) m;
            }

            System.out.println("The original message is :" + de);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    

}
