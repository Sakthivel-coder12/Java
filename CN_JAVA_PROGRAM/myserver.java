import java.io.*;
import java.net.*;
class myserver
{
	public static void main(String argss[])
	{
		try
		{	
			ServerSocket ss = new ServerSocket(1234);
			Socket ms = ss.accept();
			InputStream si = ms.getInputStream();
			InputStreamReader osw = new InputStreamReader(si);
			BufferedReader br = new BufferedReader(osw);
		
			String str = br.readLine();
		
			System.out.println("Message = "  +  str);
		
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		