import java.util.*;
import java.io.*;
import java.net.*;
public class chatcudp
{
	public static void main(String arg[])throws Exception
	{
		DatagramSocket client=new DatagramSocket();
		byte[] sendbyte=new byte[1024];
		byte[] receivebyte=new byte[1024];
		do
		{
			System.out.println("Enter the msg to server");
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			String b1=b.readLine();
			String b2=b1.trim();
			sendbyte=b2.getBytes();
			InetAddress add=InetAddress.getLocalHost();
			DatagramPacket sender=new DatagramPacket(sendbyte,sendbyte.length,add,2000);
			client.send(sender);

			DatagramPacket Receiver=new DatagramPacket(receivebyte,receivebyte.length);
			client.receive(Receiver);
			String r=new String(Receiver.getData());
			String r1=r.trim();
			System.out.println(r1);
			Arrays.fill(receivebyte,(byte) 0);
			Arrays.fill(sendbyte,(byte) 0);
			if(r1.equalsIgnoreCase("bye")||r1==null)
			{
				break;
			}
		}while(true);
	}
}