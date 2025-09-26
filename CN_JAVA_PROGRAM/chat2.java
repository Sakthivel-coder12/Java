import java.util.*;
import java.io.*;
import java.net.*;
class ser
{
	void send()
	{
		try
		{
			Scanner no = new Scanner(System.in);
			ServerSocket ss = new ServerSocket(2345);
			while(true)
			{
				Socket su = ss.accept();
				InputStream ur = su.getInputStream();
				InputStreamReader ns = new InputStreamReader(ur);
				BufferedReader th = new BufferedReader(ns);
				
				OutputStream ou = su.getOutputStream();
				OutputStreamWriter osi = new OutputStreamWriter(ou);
				BufferedWriter bw = new BufferedWriter(osi);
				String rec_msg;
				String res_s;
				while(true)
				{
					rec_msg  = th.readLine();
					if(rec_msg == null || rec_msg.equalsIgnoreCase("exit"))
					{
						break;
					}
					
					System.out.println("\n\t" + rec_msg + "\n" );
				
					res_s = no.nextLine();	
					bw.write(res_s);
					bw.newLine();
					bw.flush();
				}
				su.close();
			}	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
class chat2
{
	public static void main(String argss[])
	{
		ser n = new ser();
		n.send();
	}
}