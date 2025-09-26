import java.util.*;
import java.io.*;
import java.net.*;
class cli_se_re
{
	void send()
	{
		try
		{
			Scanner ni = new Scanner(System.in);
			Socket s = new Socket("localhost",1234);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter si = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(si);
			System.out.println("Enter the message that you want to convery");
			String str = ni.nextLine();
			bw.write(str);
	
			
			bw.flush();
			
			s.shutdownOutput();
			
			InputStream in = s.getInputStream();
			InputStreamReader nn = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(nn);
			
			String str1 = br.readLine();
			System.out.println("The response was:" + str1);
			
			br.close();
			ni.close();
			s.close();
			si.close();
			nn.close();
			in.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
class send_c
{
	public static void main(String a[])
	{
		cli_se_re o = new cli_se_re();
		o.send();
	}
}

		
		