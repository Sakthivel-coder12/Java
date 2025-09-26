import java.util.*;
import java.io.*;
import java.net.*;
class dateserver
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket se = new ServerSocket(1500);
			Socket so = se.accept();
			OutputStream osi = so.getOutputStream();
			OutputStreamWriter osw  = new OutputStreamWriter(osi);
			BufferedWriter bw = new BufferedWriter(osw);
			Date d = new Date();
			String sr = d.toString();
			osw.write(sr + "\n");
			bw.flush();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}