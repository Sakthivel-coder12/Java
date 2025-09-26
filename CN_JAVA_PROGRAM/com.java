import java.io.*;
import java.net.*;
import java.util.Scanner;

class cli_send_res
{
    void client_send() 
	{
        Scanner ni = new Scanner(System.in);
        
        try 
		{
            Socket s = new Socket("localhost", 1234);
            OutputStream ss = s.getOutputStream();
            OutputStreamWriter os = new OutputStreamWriter(ss);
            BufferedWriter bw = new BufferedWriter(os);

            System.out.print("Enter the message that you want to send: ");
            String st = ni.nextLine();
            bw.write(st);
            bw.newLine(); 
            bw.flush();
			s.close();
        }
		catch (Exception e) 
		{
            System.out.println(e);
        } 
    }

    void recli() 
	{
        try 
		{
			Socket sw = new Socket("localhost", 2453);
            InputStream sk = sw.getInputStream();
            InputStreamReader is = new InputStreamReader(sk);
            BufferedReader br = new BufferedReader(is);
            
            String str = br.readLine();
            System.out.println("The received response was: " + str);
			sw.close();
        } 
		catch (Exception e) 
		{
            System.out.println(e);
        } 
    }
}

class com 
{
    public static void main(String args[])
	{
		Scanner no = new Scanner(System.in);
        cli_send_res i = new cli_send_res();
        i.client_send();
		System.out.println("Enter the y");
		char np = no.next().charAt(0);
		if(np == 'y')
			i.recli();
		else
			System.out.println("No response");
    }
}