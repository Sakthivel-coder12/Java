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
			Socket s = new Socket("localhost",3523);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter si = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(si);
			
			InputStream in = s.getInputStream();
			InputStreamReader nn = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(nn);
			
			String mes;
			String res;
			System.out.println("Enter the String (exit) to quit the chat");
			while(true)
			{
				Date dd = new Date();
				String sd = dd.toString();
				System.out.print(sd + "|" );
				mes = ni.nextLine();
				if(mes.equalsIgnoreCase("exit"))
				{
					break;
				}
				 
				bw.write(sd  + " | " + mes + "\n");
				
	
				bw.flush();
				
				res = br.readLine();
				System.out.println(res);
			}	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
class chat1_date
{
	public static void main(String a[])
	{
		cli_se_re o = new cli_se_re();
		o.send();
	}
}

		
		