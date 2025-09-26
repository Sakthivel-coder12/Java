import java.util.*;
import java.io.*;
import java.net.*;
public class client 
{
    public static void main(String args[])
    {
        try
        {
            Scanner ni = new Scanner(System.in);
            Socket ss = new Socket("localhost",1200);
            OutputStream os = ss.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            System.out.println("Enter the message that you want to send :");
            String ssi = ni.nextLine();
            bw.write(ssi + "\n");
            bw.flush();       
            System.out.println("The client was sent the message !!!");


            System.out.println("The client is waiting for the server to send the date and the time :");
    
            InputStream in = ss.getInputStream();
            InputStreamReader sw = new InputStreamReader(in);
            BufferedReader bi = new BufferedReader(sw);
            String str1 = bi.readLine();
            System.out.println("The date and time is " + str1);
            bi.close();
            sw.close();
            in.close();
            bw.close();
            osw.close();
            os.close();
            ss.close(); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
 }