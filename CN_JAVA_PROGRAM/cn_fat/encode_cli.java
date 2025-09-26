import java.util.*;
import java.io.*;
import java.net.*;
public class encode_cli 
{
    public static void main(String args[])
    {
        try
        {
            Scanner ni = new Scanner(System.in);
            Socket ss = new Socket("localhost",2834);
            OutputStream os = ss.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            System.out.println("Enter the msg that you want to send :");

            String str = ni.nextLine();
            String str1 = "";

            for(int i=0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                int ascii = (int) ch;
                int n = ascii + 2;
                str1 += (char) n;
            }

            String iss = str1.trim();
            System.out.println("The encoded message is :" + iss);

            bw.write(str1);
            bw.flush();
            osw.close();
            os.close();
            ss.close();
        }
        catch(Exception e )
        {
            System.out.println(e);
        }
    }    
}
