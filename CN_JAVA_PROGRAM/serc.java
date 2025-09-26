import java.io.*;
import java.net.*;
import java.util.Scanner;

class ser_send_res
 {
    void ser_rec() 
	{
        try 
		{
            ServerSocket ss = new ServerSocket(1234);
            Socket su  = ss.accept();
            InputStream si = su.getInputStream();
            InputStreamReader so = new InputStreamReader(si);
            BufferedReader be = new BufferedReader(so);
            
            // Read the message from the client
            String str = be.readLine();
            System.out.println("Message received: " + str);
			su.close();

        }
		catch (Exception e) 
		{
            System.out.println(e);
        } 
    }
    
    void sendser() 
	{
        Scanner ni = new Scanner(System.in);
        try
		{
            ServerSocket ss = new ServerSocket(2453);
            Socket ms = ss.accept();
            OutputStream n = ms.getOutputStream();
            OutputStreamWriter os = new OutputStreamWriter(n);
            BufferedWriter bw = new BufferedWriter(os);
            
            System.out.print("Enter the response that you want to convey: ");
            String st = ni.nextLine();
            bw.write(st);
            bw.newLine();
            bw.flush();
			ss.close();
			ms.close();

        } 
		catch (Exception e) 
		{
            System.out.println(e);
        } 
    }
}

class serc 
{
    public static void main(String args[]) 
	{
        Scanner nit = new Scanner(System.in);
        ser_send_res c = new ser_send_res();
        c.ser_rec();
		System.out.println("Do you want to give the response:");
		String res = nit.next();
		String ress = res.toLowerCase();	
		if(ress.equals("yes"))
			c.sendser();
		else
			System.out.println("No response");

    }
}