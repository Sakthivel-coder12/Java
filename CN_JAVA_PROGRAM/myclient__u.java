import java.util.*;
import java.io.*;
import java.net.*;
public class myclient_u
{
	public static void main(String args[])
	{
		try
		{
			DatagramSocket client = new DatagramSocket();
			byte sendbyte[] = new byte[1024];
			
			InputStreamReader ss = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ss);
			String msg = br.readLine();
			sendbyte = msg.getBytes();
			
			InetAddress server = InetAddress.getLocalHost();
			DatagramPacket sender = new DatagramPacket(sendbyte,sendbyte.length,server,2000);
			
			client.send(sender);
			close.client();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}