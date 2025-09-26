import java.util.*;
import java.io.*;
import java.net.*;
class ser_chat
{
    void recei()
    {
        try
        {
            Scanner no = new Scanner(System.in);
            ServerSocket ss = new ServerSocket(2134);
            while(true)
            {
                Socket si = ss.accept();
                OutputStream os = si.getOutputStream();
                OutputStreamWriter osii = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osii);

                InputStream in = si.getInputStream();
                InputStreamReader inn = new InputStreamReader(in);
                BufferedReader op = new BufferedReader(inn);

                String m,r,res;
                while (true) 
                {
                    r = op.readLine();
                    if(r.equalsIgnoreCase("bye"))
                    {
                        System.out.println("ok bye");
                        break;
                    }
                    System.out.println("received :" + r);

                    System.out.print("send msg:");
                    m = no.nextLine();
                    bw.write(m + "\n");
                    bw.flush();
                }
                inn.close();
                in.close();
                osii.close();
                os.close();
                si.close();
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class chat_ser 
{
    public static void main(String[] args) {
        ser_chat chi = new ser_chat();
        chi.recei();
    }
}
