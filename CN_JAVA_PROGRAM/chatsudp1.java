import java.util.*;
import java.io.*;
import java.net.*;
public class chatsudp1
{
	public static void main(String arg[])throws Exception
	{
		DatagramSocket server=new DatagramSocket(2000);
		byte[] sendbyte=new byte[1024];
		byte[] receivebyte=new byte[1024];
		while(true)
		{
			DatagramPacket receiver=new DatagramPacket(receivebyte,receivebyte.length);
			server.receive(receiver);
			String r=new String(receiver.getData(),0,receiver.length);
			String r1=r.trim();
			System.out.println("The msg from Client :"+r1);
			
			
			
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the msg to Client");
			String b1=b.readLine();
			String b2=b1.trim();
			sendbyte=b2.getBytes();
			
			InetAddress add = InetAddress.getLocalHost();
			int port = receiver.getprot();
			
			DatagramPacket sender=new DatagramPacket(sendbyte,sendbyte.length,add,port);
			server.send(sender);
			
			
			if(r1.equalsIgnoreCase("bye")||r1==null)
			{
				break;
			}
		}
	}
}