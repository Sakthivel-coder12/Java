import java.util.*;
import java.io.*;
import java.net.*;
class sumserver
{
	public static void main(String args[])
	{	
		try
		{
			ServerSocket nn = new ServerSocket(1400);
			System.out.println("Server is connecting to client");
			Socket ms = nn.accept();
			System.out.println("Client connected");
			
			DataInputStream in = new DataInputStream(ms.getInputStream());
			DataOutputStream out = new DataOutputStream(ms.getOutputStream());
			
			int n = in.readInt();
			int sum =0;
			for(int i=0;i<n;i++)
			{
				sum += in.readInt();
			}
			out.writeInt(sum);
			nn.close();
			ms.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		
}
	
			
			
			