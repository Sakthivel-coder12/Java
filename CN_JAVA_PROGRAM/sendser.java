	import java.util.*;
	import java.io.*;
	import java.net.*;
	class sendser
	{
		public static void main(String args[])
		{
			Scanner ni = new Scanner(System.in);
			try
			{
				ServerSocket ss = new ServerSocket(2333);
				Socket ms = ss.accept();
				OutputStream n = ms.getOutputStream();
				OutputStreamWriter os = new OutputStreamWriter(n);
				BufferedWriter bw = new BufferedWriter(os);
				System.out.print("Enter the response that you want to convery :");
				String st = ni.nextLine();
				bw.write(st);
				bw.flush();
				n.close();
				ms.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
				