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
			Socket s = new Socket("localhost",2345);
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
				mes = ni.nextLine();
				if(mes.equalsIgnoreCase("exit"))
				{
					break;
				}
				
				bw.write(mes);
				bw.newLine();
				bw.flush();
				
				res = br.readLine();
				System.out.println( "\n\t" + res + "\n");
			}	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
class chat1
{
	public static void main(String a[])
	{
		cli_se_re o = new cli_se_re();
		o.send();
	}
}

		
		