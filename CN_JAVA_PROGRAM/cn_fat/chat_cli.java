import java.util.*;
import java.io.*;
import java.net.*;
class cli_chat
{
    void send()
    {
        try
        {
            Scanner ni = new Scanner(System.in);
            Socket ss = new Socket("127.0.0.1",2134);
            OutputStream out = ss.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out);
            BufferedWriter bw = new BufferedWriter(osw);

            InputStream in = ss.getInputStream();
            InputStreamReader inn = new InputStreamReader(in);
            BufferedReader jj = new BufferedReader(inn);
            System.out.println("To exit the chat enter the string bye");
            String msg,res,resp;
            while(true)
            {
                System.out.print("send msg:");
                msg = ni.nextLine();
                

                bw.write(msg + "\n");
                bw.flush();
                
                res = jj.readLine();
                if(res.equalsIgnoreCase("bye"))
                {
                    System.out.println("The person says bye :");
                    break;
                }
                System.out.println("received msg: " + res);
            }
            inn.close();
            in.close();
            osw.close();
            out.close();
            ss.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class chat_cli 
{
    public static void main(String args[])
    {
        cli_chat o = new cli_chat();
        o.send();
    }
}
