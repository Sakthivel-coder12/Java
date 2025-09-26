import java.util.*;
import java.io.*; 
import java.net.*;
public class encode_u
{
	public static void main(String args[])
	{
		try
		{
			DatagramSocket client = new DatagramSocket();
			byte sendbyte[] = new byte[1024];
			
			InputStreamReader ss = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ss);
			System.out.println("Enter the message :");
			String str = br.readLine();
			String str1 = str.trim();
			String sui = "";
			for(int i = 0;i< str1.length();i++)
			{
				char ch = str1.charAt(i);
				int ascii = (int) ch;
				int n = ascii + 2;
				sui += (char) n;
			}
			System.out.println("The encoded message is " + sui);
			sendbyte = sui.getBytes();
			
			InetAddress server = InetAddress.getLocalHost();
			DatagramPacket sender = new DatagramPacket(sendbyte,sendbyte.length,server,3000);
			
			client.send(sender);
			
			client.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
} 
			