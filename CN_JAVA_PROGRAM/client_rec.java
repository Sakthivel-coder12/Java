

import java.io.*;
import java.net.*;
class client_rec
{
	public static void main(String args[])
	{
		try
		{	
			Socket s = new Socket("localhost",2345);
			InputStream si = s.getInputStream();
			InputStreamReader osw = new InputStreamReader(si);
			BufferedReader br = new BufferedReader(osw);
		
			String str = br.readLine();
		
			System.out.println("The response is  = "  +  str);
		
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		