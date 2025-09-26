import java.util.*;
import java.io.*;
import java.net.*;
class decode_u
{
	public static void main(String args[])
	{
		try
		{
			DatagramSocket server = new DatagramSocket(3000);
			byte receivebyte[] = new byte[1024];
			System.out.println("Waiting for client to send to message...");
			DatagramPacket receiver = new DatagramPacket(receivebyte,receivebyte.length);
			server.receive(receiver);
			
			String message = new String(receiver.getData(),0,receiver.getLength());
			
			String str = message.trim();
			
			System.out.println("The received message is " + str);
			
			String str1 = "";
			
			for(int i = 0; i<str.length();i++)
			{
				char ch = str.charAt(i);
				int ascii = (int) ch;
				int n = ascii - 2;
				str1 += (char) n;
			}
			System.out.println("The decoded  message is " + str1);
			
			server.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}