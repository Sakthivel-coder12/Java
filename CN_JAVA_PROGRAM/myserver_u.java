import java.util.*;
import java.io.*;
import java.net.*;
class myserver_u
{
	public static void main(String args[])
	{
		try
		{
			DatagramSocket server = new DatagramSocket(2000);
			byte receivebyte[] = new byte[1024];
			
			DatagramPacket receiver = new DatagramPacket(receivebyte,receivebyte.length);
			System.out.println("Server is waiting for client message...");
			server.receive(receiver);
			String message = new String(receiver.getData(),0,receiver.getLength());
			
			System.out.println("The message is " + message);
			
			server.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		