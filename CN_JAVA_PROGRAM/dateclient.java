import java.io.*;
import java.net.*;
class dateclient
{
	public static void main(String args[])
	{
		try
		{
			Socket ss = new Socket("localhost",1500);
			InputStream si = ss.getInputStream();
			InputStreamReader os = new InputStreamReader(si);
			BufferedReader br = new BufferedReader(os);
			
			String st = br.readLine();
			
			String str = st.trim();
			
			System.out.println("The date and time is " + str);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			