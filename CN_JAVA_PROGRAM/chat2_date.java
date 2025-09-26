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
			ServerSocket ss = new ServerSocket(3523);
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
				while(true)
				{
					rec_msg  = th.readLine();
					if(rec_msg == null || rec_msg.equalsIgnoreCase("exit"))
					{
						break;
					}
					System.out.print(rec_msg + "\n");
					Date k = new Date();
					String sn = k.toString();
					System.out.print(sn + "| ");
					String res_msg = no.nextLine();
					
					bw.write(sn + " | "+ res_msg + "\n");
					
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
class chat2_date
{
	public static void main(String argss[])
	{
		ser n = new ser();
		n.send();
	}
}