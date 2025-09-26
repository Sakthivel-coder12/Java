import java.util.*;
import java.io.*;
import java.net.*;
class myclient
{
	public static void main(String args[])
	{
		Scanner ni = new Scanner(System.in);
		try
		{
			Socket s = new Socket("localhost",1234);
			OutputStream n = s.getOutputStream();
			OutputStreamWriter os = new OutputStreamWriter(n);
			BufferedWriter bw = new BufferedWriter(os);
			System.out.print("Enter the message that you want to convery :");
			String st = ni.nextLine();
			bw.write(st);
			bw.flush();
			n.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			