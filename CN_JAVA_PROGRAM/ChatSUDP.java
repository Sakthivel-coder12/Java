import java.util.*;
import java.io.*;
import java.net.*;
public class chatsudp
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
			String r=new String(receiver.getData());
			String r1=r.trim();
			InetAddress add=receiver.getAddress();
			int port=receiver.getPort();
			System.out.println("The msg from Client :"+r1);
			System.out.println("Enter the msg to Client");
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			String b1=b.readLine();
			String b2=b1.trim();
			sendbyte=b2.getBytes();
			DatagramPacket sender=new DatagramPacket(sendbyte,sendbyte.length,add,port);
			server.send(sender);
			Arrays.fill(receivebyte,(byte) 0);
			Arrays.fill(sendbyte,(byte) 0);
			if(r1.equalsIgnoreCase("bye")||r1==null)
			{
				break;
			}
		}
	}
}