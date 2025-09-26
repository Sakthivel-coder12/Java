import java.util.*;
import java.io.*;
import java.net.*;
class ser_send
{
	void send_ss()
	{
		try
		{
			Scanner no = new Scanner(System.in);
			ServerSocket ss = new ServerSocket(1234);
			Socket su = ss.accept();
			InputStream ur = su.getInputStream();
			InputStreamReader ns = new InputStreamReader(ur);
			BufferedReader th = new BufferedReader(ns);
			String svs  = th.readLine();
			System.out.println("The message is " + svs);
			
			su.shutdownInput();
			
			OutputStream ou = su.getOutputStream();
			OutputStreamWriter osi = new OutputStreamWriter(ou);
			BufferedWriter bw = new BufferedWriter(osi);
			
			System.out.println("Enter the response that you want to give:");
			String res = no.nextLine();
			
			bw.write(res);
			
			bw.flush();
			ss.close();
			su.close();
			ur.close();
			ns.close();
			th.close();
			ou.close();
			osi.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
class send_s
{
	public static void main(String argss[])
	{
		ser_send n = new ser_send();
		n.send_ss();
	}
}